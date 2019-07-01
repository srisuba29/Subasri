package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class InernetexLaunch {
	public static void main(String args[]) {
				System.setProperty("webdriver.ie.driver","D:\\Selenium\\Softwares\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		//launch
		driver.get("https://www.google.com\\");
		
		//driver.get("http:\\www.greenstechnologys.com\\");
		//driver.get("http:\\www.amazon.in\\");
		//driver.get("http:\\www.greenstechnology.com\\selenium-course-content.html");
		driver.close();
		
	
	}

}
