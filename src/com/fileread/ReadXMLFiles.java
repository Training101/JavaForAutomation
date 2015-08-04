package com.fileread;

import com.utils.ReadFromXML;

public class ReadXMLFiles {

	public static void main(String[] args) {

		ReadFromXML xmlReader = new ReadFromXML("DataXML.xml");

		Object[][] sheetData = xmlReader.getTableData("Table1");

		int rowCount = sheetData.length;

		for (int i = 0; i < rowCount; i++) {

			int colCount = sheetData[i].length;

			for (int j = 0; j < colCount; j++) {
				System.out.println(sheetData[i][j].toString());
			}

			System.out.println("************* END OF ROW " + i	+ " *************");
		}

	}
}
