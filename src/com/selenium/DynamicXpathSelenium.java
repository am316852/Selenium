package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicXpathSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com");
		
		//driver.findElement(By.xpath("//a[contains(text(),'Advanced')]")).click();
		//driver.findElement(By.xpath("//a[contains(@id,'gh-as-a')]")).click();
		//driver.findElement(By.xpath("//a[starts-with(@id,'gh-as')]")).click();
		//driver.findElement(By.xpath("//a[ends-with(@id,'as-a')]")).click();

		//get all links in the page 
		
		List<WebElement> list= driver.findElements(By.tagName("a"));
		
		System.out.println(list.size());
		
		
		
	}

}
