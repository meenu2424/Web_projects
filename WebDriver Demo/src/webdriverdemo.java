import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdriverdemo {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

driver.navigate().to("http://www.calculator.net/");

driver.manage().window().maximize();

driver.findElement(By.xpath(".//*[@id='menu']/div[3]/a")).click();

driver.findElement(By.xpath(".//*[@id='menu']/div[4]/div[3]/a")).click();

driver.findElement(By.id("cpar1")).sendKeys("10");

driver.findElement(By.id("cpar2")).sendKeys("50");

driver.findElement(By.xpath(".//*[@id='content']/table[1]/tbody/tr[2]/td/input[2]")).click();

String result=driver.findElement(By.xpath(".//*[@id='content']/p[2]/span/font/b")).getText();

System.out.println("The Result is" +result);


driver.close();
	}

}
