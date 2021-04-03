package com.selenium;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelFileUploadPop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.freepdfconvert.com/pdf-to-word");
		
           driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]")).sendKeys("/Users⁩/⁨amitkumar⁩/⁨Downloads⁩/amit.pdf");
		
	  
	}

}
