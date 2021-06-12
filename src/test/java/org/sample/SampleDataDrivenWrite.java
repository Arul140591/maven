package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.BaseClass;

public class SampleDataDrivenWrite extends BaseClass{
public static void main(String[] args) throws IOException {
	writeExcel("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\NewSheet2.xlsx", "Details", 4, 0, "arulkalya@gmail.com");
	
	updateCell("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\Details.xlsx", "Sheet1", 4, 0, "kalyani@gmail.com", "kalyani");
}
}