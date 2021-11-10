package org.test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testing extends BaseClass {
	BaseClass base = new BaseClass();

	@BeforeClass
	public void browser() {
		launch("https://adactinhotelapp.com/");
	}

	@Test
	public void loginPage1() {
		Page1 a = new Page1();

		WebElement username = a.getUsername();
		username.sendKeys("nithin0108");
		WebElement password = a.getPassword();
		password.sendKeys("nithinlari1");
		WebElement login = a.getLogin();
		login.click();
	}

	@Test
	public void page2() {
		Page2 c = new Page2();
		
		WebElement location = c.getLocation();
		dDnselect(location, "Sydney");
		WebElement hotels = c.getHotels();
		dDnselect(hotels, "Hotel Sunshine");
		WebElement room_type = c.getRoom_type();
		dDnselect(room_type, "Deluxe");
		WebElement room_nos = c.getRoom_nos();
		dDnselect(room_nos, "2 - Two");
		WebElement adult_room = c.getAdult_room();
		dDnselect(adult_room, "3 - Three");
		WebElement child_room = c.getChild_room();
		dDnselect(child_room, "4 - Four");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
