package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DyanmicXapthSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        

		driver.get("https://www.google.com/");
		
		driver.findElement(By.className("gLFyf gsfi")).sendKeys("testing");
		
		
		
		
		List<WebElement> list= driver.findElements(By.xpath("//ul[@class='erkvQe']//li/descendant::div[@class='sbl1']"));
		
		for(WebElement e: list) {
			if(e.getText().contains("testingbot")) {
				e.click();
			}
			
			
		}
		
		
		
	}

}
