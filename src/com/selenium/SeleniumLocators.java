package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();
		driver.get("https://signup.ebay.co.uk/pa/crte?ru=https%3A%2F%2Fwww.ebay.co.uk%2F");

		// get locator by id
		driver.findElement(By.id("firstname")).sendKeys("Amit");
		// get locator by name
		driver.findElement(By.name("lastname")).sendKeys("kumar");

		// get by xpath

		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ab@gmail.com");

		// get by class name
		String s = driver.findElement(By.className("giant-text-2 txt-center title")).getText();
		System.out.println(s);

		// get by css selector
		driver.findElement(By.cssSelector("#password")).sendKeys("12345");
		// get by link
		driver.findElement(By.linkText("this link.")).click();

		// get by partial link

		driver.findElement(By.partialLinkText("create a"));
		
		driver.quit();

	}

}
