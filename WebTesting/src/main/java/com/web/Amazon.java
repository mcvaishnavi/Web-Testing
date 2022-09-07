package com.web;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MVaishnavi\\Downloads\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Iphone x");
        driver.findElement(By.id("nav-search-submit-button")).submit();
        
        driver.findElement(By.linkText("Apple iPhone 12 (64GB) - (Product) RED")).click();
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        
        
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        //WebElement element = driver.findElement(By.id("submit.add-to-cart-announce"));
        
        //js.executeScript("arguments[0].scrollIntoView();", element);
        
	}

}
