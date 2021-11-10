package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void launch(String data) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(data);

	}

	public static WebElement find(String data) {
		WebElement element = driver.findElement(By.id(data));
		return element;
	}

	public void login(WebElement element) {
		element.click();

	}
	public static WebElement findName(String data) {
		WebElement findElement = driver.findElement(By.name(data));
		return findElement;
		
	}
	public void dDnselect(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
}
