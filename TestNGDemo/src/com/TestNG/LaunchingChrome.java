package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class LaunchingChrome {

		public static void main(String[] args) {
			String exePath = "C:\\Selenium\\chromedriver_win_17.0.963.0";
			System.setProperty("webdriver.chrome.driver", exePath);
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.toolsqa.com/automation-practice-form/");
		}
	}

