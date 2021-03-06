package Tool;

import hw3.swyootask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Iterator;
import java.util.Set;

// we can use static variables from swyootask class in task3.jj 
public class Join {
	public void BlockNestedJoin(int Bsize, int RecordPerPage) {
		int a = swyootask.TablesMap.get(swyootask.Tname.get(0)).CatalogInfo.records_size;
		int b = swyootask.TablesMap.get(swyootask.Tname.get(1)).CatalogInfo.records_size;
		String SmallerT = null;
		String LargerT = null;
		if (a <= b) {
			SmallerT = swyootask.Tname.get(0);
			LargerT = swyootask.Tname.get(1);
		} else {
			SmallerT = swyootask.Tname.get(1);
			LargerT = swyootask.Tname.get(0);
		}
		swyootask.TablesMap.get(swyootask.Tname.get(0)).Recs.clear();
		swyootask.TablesMap.get(swyootask.Tname.get(0)).CatalogInfo.records_size = 0;
		swyootask.TablesMap.get(swyootask.Tname.get(1)).Recs.clear();
		swyootask.TablesMap.get(swyootask.Tname.get(1)).CatalogInfo.records_size = 0;
		String ReadPathforSmallerT = swyootask.subpath.concat(SmallerT).concat(
				".txt");
		System.out.println("path setting: " + ReadPathforSmallerT);
		String ReadPathforLargerT = swyootask.subpath.concat(LargerT).concat(
				".txt");
		System.out.println("path setting: " + ReadPathforLargerT);
		String WritePath = swyootask.subpath_write.concat("OutputJoin").concat(
				".txt");
		System.out
				.println(" ================================= Block Nested Join! ================================= ");
		// Let assume Tname[0] is more smaller relation
		boolean readability1 = true;
		boolean readability2 = true;
		BlockNestJoinTool etc = new BlockNestJoinTool();
		try {
			LineNumberReader INPUT1 = new LineNumberReader(new BufferedReader(
					new FileReader(ReadPathforSmallerT)));
			LineNumberReader INPUT2 = new LineNumberReader(new BufferedReader(
					new FileReader(ReadPathforLargerT)));
			FileWriter OUTPUT = new FileWriter(WritePath);
			etc.ConstructCatalogInfo(INPUT1, SmallerT);
			etc.ConstructCatalogInfo(INPUT2, LargerT);
			OUTPUT.write(etc.CatalogString(SmallerT, LargerT));
			System.out.println("-------------------------------- Loaded Data in Main Memory --------------------------------");

			while (readability1) {
				// Load INPUT1 buffer into Bsize-2 pages
				//System.out.println("Debug of INPUT1 readability: " + readability1);
				System.out.println("***************** Load Smaller relation into Buffer with Bsize-2 pages ********************");
				for (int i = 0; i < (Bsize - 2); ++i) {
					readability1 = etc.ReadOnePages(INPUT1, SmallerT, Bsize,RecordPerPage);
				}
				// etc.showRecsInfo(SmallerT);
				System.out.println("***************** Load Smaller relation into Buffer with Bsize-2 pages end ****************");
				// Load INPUT2 buffer into One pages, and Compute the Join
				// operation
				INPUT2.mark(10000); // Mark INPUT2 buffer reader Position and at most read 10000 characters
				System.out.println("***************** Load Larger relation Inner Loop Computing ******************************");
				while (readability2) {
					//System.out.println("Debug of INPUT2 readability: "+ readability2);
					//System.out.println("Read One page ...");
					readability2 = etc.ReadOnePages(INPUT2, LargerT, Bsize,RecordPerPage);
					Set<String> Intersection = etc.getIntersectionAttributesOfTwoTables(SmallerT,LargerT);
					etc.ComputeJoin(OUTPUT, SmallerT, LargerT, Intersection);
					swyootask.TablesMap.get(LargerT).Recs.clear();
				}
				System.out.println("***************** Load Larger relation Inner Loop Computing end **************************");
				INPUT2.reset(); // reset INPUT buffer reader position into the marked position
				readability2 = true;
				swyootask.TablesMap.get(SmallerT).Recs.clear();
				swyootask.TablesMap.get(SmallerT).CatalogInfo.records_size = 0;
			}
			swyootask.TablesMap.get(LargerT).Recs.clear();
			swyootask.TablesMap.get(LargerT).CatalogInfo.records_size = 0;

			System.out.println("-------------------------------- Loaded Data in Main Memory end --------------------------------");
			// System.out.println(swyootask.TablesMap.get(SmallerT).Recs);
			// System.out.println(swyootask.TablesMap.get(SmallerT).CatalogInfo.records_size);
			// System.out.println(swyootask.TablesMap.get(LargerT)).Recs);
			// System.out.println(swyootask.TablesMap.get(LargerT)).CatalogInfo.records_size);
			//OUTPUT.write("\r\n");
			OUTPUT.close();
			System.out.println("after join ...");
			// Load Joined Data into Memory : swyootask.TablesMap.get("Join")
			etc.ReadJoinedData(WritePath);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out
				.println(" ================================= Block Nested Join end! ================================= ");
	}
	
	public static void SortMergeJoin(int Bsize, int RecordPerPage) throws IOException {
		int a = swyootask.TablesMap.get(swyootask.Tname.get(0)).CatalogInfo.records_size;
		int b = swyootask.TablesMap.get(swyootask.Tname.get(1)).CatalogInfo.records_size;
		String SmallerT = null;
		String LargerT = null;
		if (a <= b) {
			SmallerT = swyootask.Tname.get(0);
			LargerT = swyootask.Tname.get(1);
		} else {
			SmallerT = swyootask.Tname.get(1);
			LargerT = swyootask.Tname.get(0);
		}
		System.out.println(" ================================= Sort Merge Join! ================================= ");
		// PreProcessing
		SortMergeJoinTool etc = new SortMergeJoinTool();
		etc.ChangeODC(SmallerT, LargerT);
		etc.ExternalSort(SmallerT, Bsize, RecordPerPage);
		etc.ExternalSort(LargerT, Bsize, RecordPerPage);
		Debug Dbug = new Debug();
		Dbug.showTable(SmallerT);
		Dbug.showTable(LargerT);
		String TableWithNonPrimaryKey = Dbug.WhichTableHasPrimaryKey(SmallerT, LargerT);
		int i =0; int j = 0;
		int IMAX = swyootask.TablesMap.get(SmallerT).CatalogInfo.records_size;
		int JMAX = swyootask.TablesMap.get(LargerT).CatalogInfo.records_size;
		String result = null;
		while(true){
			// result has the table with smaller value of join column
			if((i< IMAX ) && (j< JMAX )) {
				result = etc.CompareJoinCol(SmallerT, i, LargerT, j);
			}
			if(result.equals("=") && (i < IMAX) && (j < JMAX)){
				JoinRecords JR = new JoinRecords(swyootask.TablesMap.get(SmallerT).Recs.get(i), swyootask.TablesMap.get(LargerT).Recs.get(j));
				System.out.print(JR.toString());
				// increase the table with Non primary key pointer!! (I have to implement this part)
				if((i< IMAX )&& (j< JMAX )) {
					if(TableWithNonPrimaryKey.equals(SmallerT)){
						++i;
					}else{
						++j;
					}
				}
			}else if(result.equals(SmallerT)){
				if((i< IMAX )&& (j< JMAX )) ++i;
			}else if(result.equals(LargerT)){
				if((i< IMAX )&& (j< JMAX )) ++j;
			}
			if((i>= IMAX )|| (j>= JMAX )){
				//System.out.println(">> end ivalue: " + i);
				//System.out.println("oo end jvalue: " + j);
				break;
			}
		}			
		System.out.println(" ================================= Sort Merge Join end! ================================= ");
	}
}