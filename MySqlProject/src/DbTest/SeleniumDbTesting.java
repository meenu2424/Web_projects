package DbTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;



import java.sql.*;
import java.util.concurrent.TimeUnit;

public class SeleniumDbTesting {

	public static void main(String[] args) throws SQLException, InterruptedException  {
		// TODO Auto-generated method stub
		
		String email="battumeenakshi2@gmail.com";
		String zipcode="76051";
		String firstname="meena";
		String lastname="battu";
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://mailing.dollartree.com/signup.jsp");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='emailAddress']")).sendKeys(email);
		driver.findElement(By.xpath(".//*[@id='zipCode']")).sendKeys(zipcode);
		driver.findElement(By.xpath(".//*[@id='firstName']")).sendKeys(firstname);
		driver.findElement(By.xpath(".//*[@id='lastName']")).sendKeys(lastname);
		
		
		Thread.sleep(5000);
		 driver.findElement(By.id("subscribeForm"));
		 driver.findElement(By.xpath(".//*[@id='subscribeForm']/div[2]/input[4]")).click();
		
		 //driver.findElement(By.id("/*[@id='subscribeForm']/div[2]/input[4]")).click();
		driver.findElement(By.xpath(".//*[@id='subscribeForm']/div[3]/input[2]")).click();
				
		
		Connection conn=null;
String url="jdbc:mysql://localhost:3306/";
String databaseName="test";
String username="admin";
String password="root";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			 conn = DriverManager.getConnection(url+databaseName,username,password);                                                                                                                                                                                                                      
			 
			 //String sqlQuerry="select * from signupdetails";
			 String sqlQuerry="Select * from signupdetails ORDER BY signid DESC LIMIT 1";
			 Statement statement=conn.createStatement();
			 ResultSet result=statement.executeQuery(sqlQuerry);
			 
			 result.next();
			 System.out.println(result.getString("email_address"));
			 System.out.println(result.getString("ZipCode"));
			 System.out.println(result.getString("FirstName"));
			 System.out.println(result.getString("LastName"));
			 
			 if(!result.getString("email_address").equals(email));
			 System.out.println("email Id is Wrong");
			 if(!result.getString("ZipCode").equals(zipcode));
			 System.out.println("ZipCode is Wrong");
			 if(!result.getString("FirstName").equals(firstname));
			 System.out.println("FirstName is Wrong");
			 if(!result.getString("LastName").equals(lastname));
			 System.out.println("LastName is Wrong");
		}
		catch(Exception e){
			System.out.println(e);
		}
	
	finally {
	if(conn!=null){
		conn=null;
		//conn.close();
	}
	}	
	}
	}


