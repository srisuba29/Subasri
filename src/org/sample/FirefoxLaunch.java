package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxLaunch {
	public static void main(String args[]) {
				System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Softwares\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//launch
		driver.get("http:\\www.facebook.com\\");
		
		driver.get("http:\\www.greenstechnologys.com\\");
		driver.get("http:\\www.amazon.in\\");
		driver.get("http:\\www.greenstechnology.com\\selenium-course-content.html");
		driver.close();
		
	
	}

}
