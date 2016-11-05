package log4j_demo;

import org.apache.log4j.*;
import org.apache.log4j.xml.DOMConfigurator;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class log4j_demo {

	static final  Logger logger=LogManager.getLogger(log4j_demo.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DOMConfigurator.configure("Log4j.xml");
		logger.info("# # # # # # # # # # # # # # # # # # # # # # # # # # #");
	logger.info("TEST Has Started");
	WebDriver driver= new FirefoxDriver();

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	driver.navigate().to("http://www.calculator.net/"); logger.info("Open Calc Application");
    
    driver.manage().window().maximize();
	
	driver.findElement(By.xpath(".//*[@id='menu']/div[3]/a")).click(); logger.info("Click Math Calculator");
	
	driver.findElement(By.xpath(".//*[@id='menu']/div[4]/div[3]/a")).click(); logger.info("Click Percent Calculator");
	
	driver.findElement(By.id("cpar1")).sendKeys("10"); logger.info("Entered Value in The First Text Box");
	
	driver.findElement(By.id("cpar2")).sendKeys("50"); logger.info("Entered Value in The Second Text Box");
	
	driver.findElement(By.xpath(".//*[@id='content']/table[1]/tbody/tr[2]/td/input[2]")).click(); logger.info("Click Calculate Button");
	
	String result=driver.findElement(By.xpath(".//*[@id='content']/p[2]/font/b")).getText(); logger.info("Get Text Value");
	
	logger.info("The Result is "  + result);
	
	if (result.equals("5")) {
	
		logger.info("The Result is Pass");
		}
	
		else{
		logger.error("TEST FAILED. NEEDS INVESTIGATION ");
		}	
	    logger.info("# # # # # # # # # # # # # # # # # # #");
	
	    driver.close();
	}

}
