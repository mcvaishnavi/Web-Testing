package com.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Book {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\MVaishnavi\\Downloads\\chromedriver_win32\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://in.bookmyshow.com/");
			driver.findElement(By.cssSelector("img[alt=\"BANG\"]")).click();
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,90)", "");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("div[data-content=\"Gaalipata 2\"]")).click();
			driver.findElement(By.cssSelector("button[data-phase=\"postRelease\"]")).click();
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,230)", "");
			driver.findElement(By.linkText("07:15 PM")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("btnPopupAccept")).click();
			Thread.sleep(2000);
			//driver.findElement(By.linkText("NORMAL")).click();
			driver.findElement(By.id("proceed-Qty")).click();
			Thread.sleep(2000);
			driver.switchTo().alert().dismiss();
			driver.findElement(By.cssSelector("a[onclick=\"fnSelectSeat('C_9_0310')\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("btmcntbook")).click();

	}

}
