package com.log4j2;

//import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logs {

	Logger log = LogManager.getLogger("Logs");
	WebDriver driver;

	@Test

	public void LogsGenerate() throws InterruptedException {
		
		
		
		
	/*	  log.fatal("Fatal message");
		  log.error("Error message");
		  log.warn("Warn message"); 
		  log.info("Info message");
		  log.debug("Debug message"); 
		  log.trace("Trace Message");*/
		 
		
		
		
		
		/*  int a=5;
		 
		 if(a%2==0)
		  { 
		  System.out.println("even number");
		  log.info(a+" is a even number ");
		  
		  }
		  
		  else 
		  { 
		  log.error(a +" is not a even number"); 
		  }*/
		 
		
		

		try {
			WebDriverManager.chromedriver().setup();
			log.info("chromedriver device is setup");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			log.info("Chromebrowser is launched");
			driver.manage().window().maximize();
			log.info("Chromebrowser window is maximized");
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			log.info("OrangeHRM login website is opened");
			Thread.sleep(3000);
			driver.findElement(By.name("username")).sendKeys("Admin");
			log.info("Entered username details");
			log.fatal("::::::::::::::::::::::::::::password is not entered:::::::::::::::::::::::::");
			Thread.sleep(2000);

		}

		catch (Exception e) {

			String logs = e.getLocalizedMessage();
			log.error("Error is :" + logs);
		} finally {

			driver.quit();
			log.info("ChromeBrowser is closed");
		}

	
		

	}

}
