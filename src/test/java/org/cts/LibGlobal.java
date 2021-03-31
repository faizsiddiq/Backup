package org.cts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal   {
	
	public static String attribute;
	
	public static WebDriver driver;
	
	public static  WebDriver launchbrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		return driver;
		
	}	
	public static void loadurl(String url) {
		driver.get(url);
		

	}
	
	
	public static void currentpageurl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	
	public static void maxwindow() {
		driver.manage().window().maximize();

	}
	public static void pagetitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}
	public static void clickbutton(WebElement element) {
		element.click();
		
	}
	public static void submitbutton(WebElement element ) {
		element.submit();
		

	}
	public static void quittheWindow() {
		driver.quit();

	}
	public static void fill(WebElement element ,String text) {
		element.sendKeys(text);
		
		
	}
	public static void getthetextfromelement(WebElement element) {
		String text = element.getText();
		System.out.println(text);
		
		
	}
	public static String getThetextFromAttribute(
			WebElement element,String value) {
		String attribute = element.getAttribute(value);
		System.out.println(attribute);
		return attribute;
		
	}
	public static void rightclick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
		
	}
	public static void performdoubleclick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}
	public static void performMovetoEleemnt(WebElement element) {
		
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	public static void performDragAndDrop(WebElement src,WebElement dest) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, dest).perform();
		

	}
	public static void performcopy(WebElement element) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		
	}
	
	public static void performCut(WebElement element) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
	}
	
	public static void performpaste(WebElement element) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}
	public static void performTab(WebElement element) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
	}
	public static void selectvalue(WebElement element,String value) {
		Select s = new Select(element);
		s.selectByValue(value);
		

	}
	public static void selectText(WebElement element,String text) {
		
		Select s = new Select(element);
		s.deselectByVisibleText(text);

	}
	public static void selectIndex(WebElement element,int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	
	
	}
	public static void checkmultiple(WebElement element) {
		
		Select s = new Select(element);
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);

	}
	public static void deselectallElement(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
		

	}
	public static void deselectValue(WebElement element,String value) {
		Select s = new Select(element);
		s.deselectByValue(value);
		

	}
	public static void deSelecttext(WebElement element,String text) {
		
		Select s = new Select(element);
		s.deselectByVisibleText(text);

	}
	public static  void deSelectIndex(WebElement element,int index) {
		Select s = new Select(element);
		s.deselectByIndex(index);

	}
	public static void firstselectedOption(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption);
		

	}
	public static void Scrollup(WebElement element) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].ScrollIntoview(true)", element);
		
	}
	public static void ScrollDown(WebElement element) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].ScrollIntoview(false)", element);

	}
	public static void hiddenAttribute(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("aruguments[0].getAtrribute('value')", element);

	}
	public static void hiddenclick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("aruguments[0].click()",element);

	}
	public static void alertAccept() {
		Alert a =driver.switchTo().alert();
		a.accept();
	}
	
	public static void alertdismiss() {
		Alert a =driver.switchTo().alert();
		a.dismiss();

	}
	public static void alertText(String text) {
		Alert a =driver.switchTo().alert();
		a.sendKeys(text);
		
		

	}
	public static void alertAttribute() {
		Alert a =driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);

	}
	public static void switchtoFrameByName(String Name) {
		driver.switchTo().frame(Name);
		

	}
	public static void switchtomainframe() {
		driver.switchTo().defaultContent();

	}
	public static void switchToframebyWebelement(WebElement element) {
		driver.switchTo().frame(element);
		

	}
	
	public static void naviagtetoUrl(String url) {
		
		driver.navigate().to(url);

	}
	public static void naviagteNextpage() {
		driver.navigate().forward();
		

	}
	public static void naviagtepreviouspage() {
		driver.navigate().back();

	}
	public static void checkWebElementEnable(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
		

	}
	public static void checkWebelementdisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	

	}
	public static void checkWebElementselected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
		

	}
	public static void sleep(int millisec) throws InterruptedException {
		Thread.sleep(millisec);
		

	}
	public static void implicitwaitsecond(int sec ,TimeUnit seconds) {
		driver.manage().timeouts().implicitlyWait(sec, seconds);
		

	}
	
	public static String ExcelRead(int rowNo ,int cellNo) throws IOException {
		
		File file = new File("C:\\Users\\ashick\\eclipse-workspace\\selenium11.30\\WorkDataExcel\\page.xlsx");
		FileInputStream fin = new FileInputStream(file);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("sheet3");
		
		Row r = s.getRow(rowNo);
		
		String value="";
		
		Cell c = r.getCell(cellNo);
		int cellType=c.getCellType();
		
		if (cellType==1) {
			
			 value= c.getStringCellValue();
			
			
		}
		else if (DateUtil.isCellDateFormatted(c)) {
			
			Date d = c.getDateCellValue();
			
			SimpleDateFormat sim = new SimpleDateFormat("dd-mm-yyyy");
			
		 value = sim.format(d);
		}
		else {
			double dd = c.getNumericCellValue();
			long l = (long)dd;
		 value = String.valueOf(l);
			
		}
		return value;
		
		
	}
	private void ExcelWrite(int rowNo,int cellNo,String data) throws IOException {
		
		File file = new File("C:\\Users\\ashick\\eclipse-workspace\\selenium11.30\\WorkDataExcel\\page.xlsx");
		
		FileInputStream fin= new FileInputStream(file);
        Workbook w = new XSSFWorkbook();
		
		Sheet s = w.getSheet("sheet3");
		
		Row r = s.getRow(rowNo);
		
		Cell c = r.createCell(cellNo);
		
		c.setCellValue(data);
		
		FileOutputStream fout = new FileOutputStream(file);
		
		w.write(fout);
		
		
		
		
		
	}
	
	

}
