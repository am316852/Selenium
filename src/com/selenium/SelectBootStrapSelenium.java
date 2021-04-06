package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectBootStrapSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ui.cogmento.com/");
		driver.findElement(By.name("email")).sendKeys("vectoramitk@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Amit1234");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='right floated setting icon color-gray']")).click();
		driver.findElement(By.xpath("//i[@class='dropdown icon']")).click();
		driver.findElement(By.xpath("//div[@class='item']//span[text()='deals']")).click();
		
}
}