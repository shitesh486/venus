package com.actitim.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
public String readDataFromPropertyFile(String key) throws IOException {
	FileInputStream fis = new FileInputStream("./Data/commonData.properties");
	Properties p = new Properties();
	p.load(fis);
	String data = p.getProperty(key);
	return data;
}
public String readDataFromExcelFile(String Testcase1,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis =new FileInputStream("./Data/Testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	return wb.getSheet(Testcase1).getRow(row).getCell(cell).getStringCellValue();
}

public void writeDataIntoExecl(String Testcase1,int row,int cell,String value) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./Data/Testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet(Testcase1).getRow(row).getCell(cell).setCellValue(value);
	FileOutputStream fos = new FileOutputStream("./Data/Testscript.xlsx");
	wb.write(fos);
	wb.close();
	
}
}
