package org.cts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.common.usermodel.Fill;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameWork extends LibGlobal {
	
	public static void main(String[] args) throws IOException {
		
		
		launchbrowser();
		loadurl("http://adactinhotelapp.com/");
		maxwindow();
		implicitwaitsecond(10, TimeUnit.SECONDS);
		WebElement txtname = driver.findElement(By.id("username"));
		fill(txtname, ExcelRead(1, 0));
		WebElement txtpass = driver.findElement(By.id("password"));
		fill(txtpass,ExcelRead(1, 1));
		WebElement btnclick = driver.findElement(By.id("login"));
		clickbutton(btnclick);
		WebElement droplocation = driver.findElement(By.id("location"));
		selectIndex(droplocation, 1);
		WebElement drophotels = driver.findElement(By.id("hotels"));
		selectIndex(drophotels, 2);
		WebElement dropRoomtype = driver.findElement(By.id("room_type"));
		selectIndex(dropRoomtype, 3);
		WebElement dropnoOfRooms = driver.findElement(By.id("room_nos"));
		selectIndex(dropnoOfRooms, 2);
		WebElement datecheckin = driver.findElement(By.id("datepick_in"));
		fill(datecheckin,ExcelRead(1, 2));
		WebElement datecheckout = driver.findElement(By.id("datepick_out"));
		fill(datecheckout, ExcelRead(1, 3));
		WebElement dropadult = driver.findElement(By.id("adult_room"));
		selectIndex(dropadult, 2);
		WebElement dropchildren = driver.findElement(By.id("child_room"));
		selectIndex(dropchildren, 1);
		WebElement btnsubmit = driver.findElement(By.id("Submit"));
		submitbutton(btnsubmit);
		WebElement radiobtn = driver.findElement(By.id("radiobutton_0"));
		clickbutton(radiobtn);
		WebElement clickcontinue = driver.findElement(By.id("continue"));
		clickbutton(clickcontinue);
		WebElement firstname = driver.findElement(By.id("first_name"));
		fill(firstname, ExcelRead(1, 4));
		WebElement lastname = driver.findElement(By.id("last_name"));
		fill(lastname, ExcelRead(1, 5));
		WebElement address = driver.findElement(By.id("address"));
		fill(address, ExcelRead(1, 6));
		WebElement creditno = driver.findElement(By.id("cc_num"));
		fill(creditno, ExcelRead(1, 7));
		WebElement dropcardType = driver.findElement(By.id("cc_type"));
		selectIndex(dropcardType, 2);
		WebElement dropexmonth = driver.findElement(By.id("cc_exp_month"));
		selectIndex(dropexmonth, 2);
		WebElement dropexyear = driver.findElement(By.id("cc_exp_year"));
		selectIndex(dropexyear, 2);
		WebElement ccvNo = driver.findElement(By.id("cc_cvv"));
		fill(ccvNo, ExcelRead(1, 8));
		WebElement clickbtn = driver.findElement(By.id("book_now"));
		clickbutton(clickbtn);
		WebElement orderno = driver.findElement(By.id("order_no"));
		getThetextFromAttribute(orderno, "value");
		
		
	
		
	}

	
	}

	
	
	
	
	
	
	
	
	
	
	


