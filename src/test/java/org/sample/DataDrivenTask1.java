package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.BaseClass;

public class DataDrivenTask1 extends BaseClass {
	public static void main(String[] args) throws IOException {
writeExcel("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\StudentsList.xlsx","Data", 0, 0,"Students Name");
createNewCellAndWriteData("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\StudentsList.xlsx","Data", 0, 1,"Courses");
createNewRowAndOneCellAlone("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\StudentsList.xlsx","Data", 1, 0,"Arul");
createNewCellAndWriteData("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\StudentsList.xlsx","Data", 1, 1,"Selenium");
createNewRowAndOneCellAlone("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\StudentsList.xlsx","Data", 2, 0,"Glory");
createNewCellAndWriteData("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\StudentsList.xlsx","Data", 2, 1,"Java");
createNewRowAndOneCellAlone("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\StudentsList.xlsx","Data", 3, 0,"Kamaraj");
createNewCellAndWriteData("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\StudentsList.xlsx","Data", 3, 1,"Embeded");	
createNewRowAndOneCellAlone("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\StudentsList.xlsx","Data", 4, 0,"Durga");
createNewCellAndWriteData("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\StudentsList.xlsx","Data", 4, 1,"AWS");
createNewRowAndOneCellAlone("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\StudentsList.xlsx","Data", 5, 0,"Saravanan");
createNewCellAndWriteData("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\StudentsList.xlsx","Data", 5, 1,"FrameWork");
createNewRowAndOneCellAlone("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\StudentsList.xlsx","Data", 6, 0,"Karthik");
createNewCellAndWriteData("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\StudentsList.xlsx","Data", 6, 1,"Java");
createNewRowAndOneCellAlone("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\StudentsList.xlsx","Data", 7, 0,"Kanmani");
createNewCellAndWriteData("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\StudentsList.xlsx","Data", 7, 1,"Selenium");
createNewRowAndOneCellAlone("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\StudentsList.xlsx","Data", 8, 0,"Sudha");
createNewCellAndWriteData("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\StudentsList.xlsx","Data", 8, 1,"PHP");
createNewRowAndOneCellAlone("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\StudentsList.xlsx","Data", 9, 0,"Menaka");
createNewCellAndWriteData("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\StudentsList.xlsx","Data", 9, 1,"Python");
createNewRowAndOneCellAlone("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\StudentsList.xlsx","Data", 10, 0,"Thyagu");
createNewCellAndWriteData("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\StudentsList.xlsx","Data", 10, 1,"Advance Java");

File f = new File("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\StudentsList.xlsx");
FileInputStream fis = new FileInputStream(f);
Workbook wb = new XSSFWorkbook(fis);
Sheet sheet = wb.getSheet("Data");
int rowCounts = sheet.getPhysicalNumberOfRows();
for(int i=0;i<rowCounts;i++) {
Row row = sheet.getRow(i);
int cellCounts = row.getPhysicalNumberOfCells();
for(int j=0;j<cellCounts; j++) {
Cell cell = row.getCell(j);
String s = cell.getStringCellValue();
System.out.println(s);
}}}}
