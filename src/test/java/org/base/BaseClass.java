package org.base;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
	}
	public static void launchUrl(String url) {
        driver.get(url);
    }
    public static void toPassText(WebElement element, String text) {
    	element.sendKeys(text);
	}
    public static void toClick(WebElement element) {
	    element.click();
	}
    public static String titleOfThePage() {
    	String title = driver.getTitle();
    	return title;
	}
    public static void currentUrl() {
        String url = driver.getCurrentUrl();
        System.out.println(url);
	}
    public static void toMaximize() {
	    driver.manage().window().maximize();
	}
    
    public static void toTakeScreenShot(String imgName) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File ss = ts.getScreenshotAs(OutputType.FILE);
	File f = new File("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\images\\"+imgName);
	FileUtils.copyFile(ss, f);
	}
    public static void moveTheCursor(WebElement element) {
		a=new Actions(driver);
		a.moveToElement(element).perform();
	}
 // Data driven framework
    public static String excelRead(String SheetName, int rowNumber, int cellNumber) throws IOException {
    // 1.To mention path of the excel Sheet
    	File f = new File("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\Details.xlsx");
    //2. To read the file
    	FileInputStream fis = new FileInputStream(f);
    //3. To read the .xlsx format file
    	Workbook wb = new XSSFWorkbook(fis);
    //4. Get the Sheet
    	Sheet mySheet = wb.getSheet(SheetName);
    //5.  To get the row from mySheet
    	Row getRowOneByOne = mySheet.getRow(rowNumber);
    //6. to get the cell from getRowOneByOne
    	Cell getCellOneByOne = getRowOneByOne.getCell(cellNumber);
    	int cellType = getCellOneByOne.getCellType();
    // CellType -1 ->That cell is String Cell(Alphabet)
    //CellType - other than 1 -> That cell is numeric cell/data cell
    	String value = "";
    	if(cellType ==1)
    	{
    		value = getCellOneByOne.getStringCellValue();
    	}
    	else if(DateUtil.isCellDateFormatted(getCellOneByOne)) {
    		Date d = getCellOneByOne.getDateCellValue();
    		SimpleDateFormat s = new SimpleDateFormat("mm/dd/yyyy");
    		value = s.format(d);
    	}
    	else {
    		double dd = getCellOneByOne.getNumericCellValue();
    		long l = (long)dd;
    		value = String.valueOf(l);
    	}
        return value;
    	}
    // Method for Writing excel file
       public static void writeExcel(String excel, String sheetName,int rowNumber,int cellNumber, String writeData ) throws IOException {
    	   File f = new File(excel);
    	   Workbook wb = new XSSFWorkbook();
    	   Sheet sh = wb.createSheet(sheetName);
    	   Row r = sh.createRow(rowNumber);
    	   Cell c = r.createCell(cellNumber);
    	   c.setCellValue(writeData);
    	   FileOutputStream fos = new FileOutputStream(f);
    	   wb.write(fos);
    	   System.out.println("Written....");		
    	   }
    // Method for updating excel file
       public static void updateCell(String excel,String sheetName,int rowNumber,int cellNumber,String existingData, String newData) throws IOException {
    	   File f = new File(excel);
    	   FileInputStream fis = new FileInputStream(f);
    	   Workbook wb = new XSSFWorkbook(fis);
    	   Sheet mySheet = wb.getSheet(sheetName);
    	   Row particularRow = mySheet.getRow(rowNumber);
    	   Cell particularCell = particularRow.getCell(cellNumber);
    	   String s = particularCell.getStringCellValue();
    	   if(s.equals(existingData)) {
    		   particularCell.setCellValue(newData);
    	   }
    	   FileOutputStream fos = new FileOutputStream(f);
    	   wb.write(fos);
    	   System.out.println("Updated....");
    	   }
    // to Close Browser
       public static void closeBrowser() {
    	   driver.close();
    	   }
     // DropDown
       public static void dropDown(WebElement element,String data) {
    	   Select s = new Select(element);
   		   s.selectByVisibleText(data);
   		   }
       
      //ScrollDown
       public static void scrollDown(WebElement element ) {
    	   JavascriptExecutor js = (JavascriptExecutor)driver;   		
   		   js.executeScript("arguments[0].scrollIntoView(true)", element);
   		   }
       //Get attribute
       
       public static String gettingValue(WebElement element) {
    	   String attribute = element.getAttribute("value");
    	   return attribute;
    	   }
       // To write multiple cell in same sheet
       public static void createNewCellAndWriteData(String excel, String sheetName,int rowNumber,int cellNumber, String writeData ) throws IOException {
    	   File f = new File(excel);
    	   FileInputStream fis = new FileInputStream(f);
    	   Workbook wb = new XSSFWorkbook(fis);
    	   Sheet sheet = wb.getSheet(sheetName);
    	   Row row = sheet.getRow(rowNumber);
    	   Cell cell = row.createCell(cellNumber);
    	   cell.setCellValue(writeData);
    	   FileOutputStream fos = new FileOutputStream(f);
    	   wb.write(fos);
    	   }
       public static void createNewRowAndOneCellAlone(String excel, String sheetName,int rowNumber,int cellNumber, String writeData) throws IOException {
    	   File f = new File(excel);
    	   FileInputStream fis = new FileInputStream(f);
    	   Workbook wb = new XSSFWorkbook(fis);
    	   Sheet sheet = wb.getSheet(sheetName);
    	   Row row = sheet.createRow(rowNumber);
    	   Cell cell = row.createCell(cellNumber);
    	   cell.setCellValue(writeData);
    	   FileOutputStream fos = new FileOutputStream(f);
    	   wb.write(fos);
    	   }
       //getText
       public static String gettingText(WebElement element) {
    	   String text = element.getText();
    	   return text;
			}
       
       
      
    
    
    
}
