package Tool;
import hw3.swyootask;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.Set;

import schema.Records;

public class SortMergeJoinTool {
	
	public void ExternalSort(String T, int Bsize, int RecordPerPage) throws IOException{	
		swyootask.Write_InitialPass(T, RecordPerPage);
		int TotalPages = swyootask.TablesMap.get(T).CatalogInfo.records_size/ RecordPerPage; // it means N
		int PassZeroRuns = TotalPages / 1; 
				
		int TotalPasses = (int) Math.ceil(Math.log(PassZeroRuns)/Math.log(Bsize-1));
		System.out.println("TotalPages (N) : " + TotalPages);
		System.out.println("TotalPasses : " + TotalPasses);
		for (int passN = 1; passN < TotalPasses + 1; passN++) {
			swyootask.SortPasses(T, 4, passN, RecordPerPage);
		}
		swyootask.sortedfilepath = swyootask.subpath_write.concat(T).concat("_" + TotalPasses + "_0.txt");
		System.out.println("Final sortedfilepath: " + swyootask.sortedfilepath);
		UpdateInfo(T);
	}
	
	public void ChangeODC(String SmallerT, String LargerT){
		// Assume that Joined Column is only one.
		BlockNestJoinTool Util = new BlockNestJoinTool();
		Set<String> Intersection = Util.getIntersectionAttributesOfTwoTables(SmallerT,LargerT);
		Iterator<String> IntersectedStrings = Intersection.iterator();
		String IS = IntersectedStrings.next();
		swyootask.ODC = IS;
	}
	
	public void UpdateInfo(String T) throws IOException{
		//System.out.println("UpdateInfo !!! ");
		FileInputStream fi = null;
		ObjectInputStream oi = null;
		int i = 0;
		try {
			fi = new FileInputStream(swyootask.sortedfilepath);
        	oi = new ObjectInputStream(fi);
        	while(true) { 
        		Records r = null;
        		if(!(fi.available() > 0)) break;
        		r = (Records)oi.readObject();
        		swyootask.TablesMap.get(T).Recs.set(i,r);
        		i++;
        	}
		}
		catch(ClassNotFoundException e) {
        	e.printStackTrace();
		}
		finally {
			if(oi !=null) {
				oi.close();
			}
			if(fi != null) {
        		fi.close();
        	}
		}
		  
	}

}
