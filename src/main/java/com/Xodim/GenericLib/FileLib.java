package com.Xodim.GenericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author Bandam Harini
 *
 */

public class FileLib {
		/**
		 * This generic method is used to read the data from the property file
		 * @param path
		 * @param key
		 * @return String
		 * @throws Throwable
		 */
		public String readPropertyData(String path,String key) throws Throwable {
			FileInputStream fis=new FileInputStream(path);
			Properties prop=new Properties();
			prop.load(fis);
			String value=prop.getProperty(key,"Incorrect key");
			return value;
		}
		/**
		 * This generic method is used to read the data from the Excel file
		 * @param path
		 * @param SheetName
		 * @param row
		 * @param cell
		 * @return String
		 * @throws Throwable
		 */
		public String readExcelData(String path,String SheetName,int row,int cell) throws Throwable 
		 {

	FileInputStream fis=new FileInputStream(path);
	Workbook wb=WorkbookFactory.create(fis);
	String excelvalue=wb.getSheet(SheetName).getRow(row).getCell(cell).toString();
	return excelvalue;
	}
		/**
		 * This generic method is used to write the data into the excel sheet
		 * @param path
		 * @param SheetName
		 * @param row
		 * @param cell
		 * @param data
		 * @throws IOException
		 */
	public void writeExcelData(String path,String SheetName,int row,int cell,String data) throws IOException
	{
	FileInputStream fis=new FileInputStream(path);
	Workbook wb=WorkbookFactory.create(fis);
	wb.getSheet(SheetName).getRow(row).createCell(cell).setCellValue(data);
	FileOutputStream fos=new FileOutputStream(path);
	wb.write(fos);
	}
	/**
	 * This generic method is used to count the total rows filled in any sheet of an excel file
	 * @param path
	 * @param sheet
	 * @return
	 * @throws Throwable
	 */
	public int getRowCount(String path,String sheet) throws Throwable
	{
	FileInputStream fis=new FileInputStream(path);
	Workbook wb=WorkbookFactory.create(fis);
	int rowCount = wb.getSheet(sheet).getLastRowNum();
	return rowCount;
	}
	}


