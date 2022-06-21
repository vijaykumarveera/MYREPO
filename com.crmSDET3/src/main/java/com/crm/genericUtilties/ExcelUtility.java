package com.crm.genericUtilties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author vijaykumar v
 *
 */
public class ExcelUtility 
{
	public String getExcelData(String sheetname,int row ,int cell) throws Throwable
	{
		FileInputStream fileInputStream = new FileInputStream(IPathConstants.excelPath);
		Workbook book = WorkbookFactory.create(fileInputStream);
		Sheet sheet = book.getSheet(sheetname);
		Row row1 = sheet.getRow(row);
		Cell cell1 = row1.getCell(cell);
		String value = cell1.toString();
		return value;
	}
	/**
	 * its used to write data into excel file
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @param data
	 * @throws Throwable
	 */
	public void writeDataIntoExcel(String sheetName,int rowNum, int cellNum,String data)throws Throwable
	{
		FileInputStream fileInputStream = new FileInputStream(IPathConstants.excelPath);
		Workbook book = WorkbookFactory.create(fileInputStream);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.createCell(cellNum);
		cell.setCellValue(data);
		FileOutputStream fileOutputStream = new FileOutputStream(IPathConstants.excelPath);
		book.write(fileOutputStream);
	}
	/**
	 * its used to fetch the numericcell value from excel file
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws Throwable
	 */
	public double getExcelDataTest(String sheetname,int row ,int cell) throws Throwable
	{
		FileInputStream fileInputStream = new FileInputStream(IPathConstants.excelPath);
		Workbook book = WorkbookFactory.create(fileInputStream);
		Sheet sheet = book.getSheet(sheetname);
		Row row1 = sheet.getRow(row);
		Cell cell1 = row1.getCell(cell);
		double value = cell1.getNumericCellValue();
		return value;
	}
	/**
	 * its used to fetch the numbeic value from excel file
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws Throwable
	 */
	public String getNumericValueFromExcel(String sheetname,int row ,int cell) throws Throwable
	{
		FileInputStream fileInputStream = new FileInputStream(IPathConstants.excelPath);
		Workbook book = WorkbookFactory.create(fileInputStream);
		Sheet sheet = book.getSheet(sheetname);
		Row row1 = sheet.getRow(row);
		Cell cell1 = row1.getCell(cell);
		DataFormatter data = new DataFormatter();
		String value = data.formatCellValue(cell1);
		return value;

	}
}