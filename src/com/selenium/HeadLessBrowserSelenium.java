package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowserSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new  HtmlUnitDriver();
		
		driver.get("https://www.spicejet.com/");
		
		
		
		

	}

}
