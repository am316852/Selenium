package com.selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUpWindowSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
		driver.get("http://www.dummysoftware.com/popupdummy_testpage.html");
		driver.findElement(By.name("PushButton")).click();
		
		Set<String> set= driver.getWindowHandles();
		System.out.println(set);
		
		Iterator< String> i= set.iterator();
		
		String p= i.next();
		
		String c= i.next();
		
		driver.switchTo().window(c);
		System.out.println(driver.getTitle());
		
		driver.close();
		driver.switchTo().window(p);
		System.out.println(driver.getTitle());

	}

}
