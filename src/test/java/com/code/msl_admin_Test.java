package com.code;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class msl_admin_Test extends msl_admin
{

	WebDriver driver;
	
	msl_admin adminobj=new msl_admin();
	
	 
  @Test
  public void TestmsladminTab()
  {
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 // driver.findElement(By.xpath("//*contains(text(),adminobj.home_text)")).click();
	  System.out.println("Browser is opened test method");
	  driver.findElement(By.xpath("//a[contains(text(),"+"'"+adminobj.home_text+"'"+")]")).click();
  }
  
  @BeforeTest
  public void beforeTest() 
  {

	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\keerthi_r_satanoor\\workspace_Java\\geckodriver-v0.24.0-win64(1)\\geckodriver.exe");
		driver=new FirefoxDriver();
	  System.out.println("Browser is opened ");
	  
	  driver.navigate().to(adminobj.guru99_url); 
	  
	  System.out.println(" After Browser is opened ");
	  System.out.println(" After Browser is opened ");
	  System.out.println(" After Browser is opened ");
	
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
  }

}
