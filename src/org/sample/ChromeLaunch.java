package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// launch
		driver.get("http:\\www.facebook.com\\");

		driver.get("http:\\www.greenstechnologys.com\\");
		driver.get("http:\\www.amazon.in\\");
		driver.get("http:\\www.greenstechnology.com\\selenium-course-content.html");
		driver.close();

	}

}
