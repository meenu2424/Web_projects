package com.TestNG;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

public class TestNGClass{

	
		 private WebDriver driver; 
		 private String URL= "http://www.calculator.net";
		@Parameters("browser")
		@BeforeTest
		
		public void launchapp(String browser){
			
			if(browser.equalsIgnoreCase("firefox")){
				System.out.println("Executing on FireFox");
				driver =new FirefoxDriver();
				driver.get(URL);
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.manage().window().maximize();
					}
			
			else if(browser.equalsIgnoreCase("Chrome")){
			System.out.println("Executing on CHROME");
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win_17.0.963.0");
			 driver=new ChromeDriver();
			 driver.get(URL);
			 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			 driver.manage().window().maximize();
			 }
			
			else if(browser.equalsIgnoreCase("Ie")){
				System.out.println("Executing on IE");
				System.setProperty("webdriver.ie.driver","C:\\Selenium\\IEDriverServer_x64_2.48.0");
				driver=new InternetExplorerDriver();
				driver.get(URL);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				}
			else {
				throw new IllegalArgumentException("The Browser Type Is undefined");
			}
		}
		
		@Test
		public void calculatepercent()
		{
		driver.findElement(By.xpath(".//*[@id='menu']/div[3]/a")).click();	
		driver.findElement(By.xpath(".//*[@id='menu']/div[4]/div[3]/a")).click();
		driver.findElement(By.id("cpar1")).sendKeys("10");
		driver.findElement(By.id("cpar2")).sendKeys("50");
		driver.findElement(By.xpath(".//*[@id='content']/table[1]/tbody/tr[2]/td/input[2]")).click();
		String result=driver.findElement(By.xpath(".//*[@id='content']/p[2]/font/b")).getText();
			
		System.out.println("The Result is:" +result);

		if(result.equals("5")){
			System.out.println("The Result is : Pass");
			
		}
		else System.out.println("The Result is:Fail");
		}
		
@AfterTest
public void closeBrowser()
{

driver.close();
	}

}
