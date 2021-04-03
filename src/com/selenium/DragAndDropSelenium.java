package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		driver.switchTo().frame(1);

		Thread.sleep(2000);
		Actions actions = new Actions(driver);

		actions.clickAndHold(driver.findElement(By.xpath("//body/div[1]/ul[1]/li[1]/img[1]")))
				.moveToElement(driver.findElement(By.xpath("//div[@id='trash']"))).release().build().perform();

	}

}
