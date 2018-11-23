package Tool;

import hw3.swyootask;

public class JoinPrint {
	public void joinTablePrint() {
		String T = "Join";
		// Debug read file
		if (swyootask.All == true) {
			for (String Ac : swyootask.TablesMap.get(T).Recs.get(0).Attr_ValPairs
					.keySet()) {
				System.out.print(Ac + "		");
			}
			System.out.println();
			// each record, I have to print selected attributes
			for (int i = 0; i < swyootask.TablesMap.get(T).CatalogInfo.records_size; i++) {
				for (String Ac : swyootask.TablesMap.get(T).Recs.get(0).Attr_ValPairs
						.keySet()) {
					if (swyootask.TablesMap.get(T).CatalogInfo.Attrs
							.contains(Ac)) {
						System.out
								.print(swyootask.TablesMap.get(T).Recs.get(i).Attr_ValPairs
										.get(Ac) + "		");
					} else {
						System.out.print("NULL " + "		");
					}
				}
				System.out.println();
			}
		} else {
			for (String Sc : swyootask.Scol) {
				System.out.print(Sc + "		");
			}
			System.out.println();
			// each record, I have to print selected attributes
			for (int i = 0; i < swyootask.TablesMap.get(T).CatalogInfo.records_size; i++) {
				for (String Sc : swyootask.Scol) {
					if (swyootask.TablesMap.get(T).CatalogInfo.Attrs
							.contains(Sc)) {
						System.out
								.print(swyootask.TablesMap.get(T).Recs.get(i).Attr_ValPairs
										.get(Sc) + "		");
					} else {
						System.out.print("NULL" + "		");
					}
				}
				System.out.println();
			}
		}
	}
}
