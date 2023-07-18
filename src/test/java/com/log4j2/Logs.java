package com.log4j2;

import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
//import org.apache.logging.log4j.LogManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logs {

	Logger log = LogManager.getLogger("Logs");
	WebDriver driver;
	
	
                                        //             ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: log levels::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::                        //
	@Test

	public void LogsGenerate() throws InterruptedException {

	/*   log.fatal("Fatal message");
		log.error("Error message");
		log.warn("Warn message");
		log.info("Info message");
		log.debug("Debug message");
		log.trace("Trace Message");*/
		

		                        //           ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: Checking the number is even or not:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::     //

		
	/*	  int a=29;
		  
		  if(a%2==0)
		  { 
		//	  System.out.println(a +" is a even number");
		          log.info(a+"  is a even number ");
		  
		  }
		  
		  else {
			  log.error(a +"  is not a even number"); 
			  }*/
		
		          
		 

	 //                                ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: Buying product through otp  :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::              //                                                                 //

		// Client conditions & Questions

		// If internet speed is below 50 % , At the time of payment processing it will  wont work
		// 100 to 90- Outstanding , 89 to 75 - excellent , 74 to 60 - ok , 59 to 50 -warn , below 49 - turn off
		// The otp entering in textbox time and click enter time , internet speed is not  required /matters

		// 1. when user enters right otp with 60% net speed?
		// 2. when user enters wrong otp with 80% net speed?
		// 3. when user enters right otp , with internet speed is 54%?
		// 4. when user enters right otp,which internet speed is above 59% but problem in checking the Request message time?
		// 5.when user enters right otp but internet speed is below 50%?
		
	    int otp = 458283;

		String checkingTheRequestMessagebyApplication = "Valid otp you have entered and processing the request, Please wait";

		int InternetSpeed = 59;
		
	    log .info("User Entering the OTP  "+ otp);

		if (otp == 458283) 
		{

			log.info("User entered  the OTP");

			if (InternetSpeed >= 50 && InternetSpeed <= 59)
			{

				log.warn("Internt speed is close to 50%   which is  "+ InternetSpeed+ "% , So it may stop your payment service");

			}

			if (checkingTheRequestMessagebyApplication.equals("Valid otp you have entered and processing the request, Please wait") && InternetSpeed >= 50) 
			{
				 log.info("Your Request has Processed ");
				 log.info("You bought the product");
			}

			else 
			{
				log.fatal("Your otp is valid ,but due to some internal issue from appliaction your request is not proceed, problem on internal program area side, Sorry for your inconvience ");
			}

		}

		else {

			log.error("Wrong otp you have entered  ,So you can not buy the product");
		}

		
		                                                    //         :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::   OrangeHRM :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::    //
		
		
		
	/*	  try
		  {
			WebDriverManager.chromedriver().setup();
		  log.info("chromedriver device is setup");
		  ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*"); 
		  driver =new ChromeDriver(options);
		  log.info("Chromebrowser is launched");
		 driver.manage().window().maximize();
		 log.info("Chromebrowser window is maximized");
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  log.info("OrangeHRM login website is opened");
		  Thread.sleep(3000);
		  driver.findElement(By.name("username")).sendKeys("Admin");
		 log.info("Entered username details"); 
		 Thread.sleep(2000);
		 
		 
		  
		 }
		  
		  catch (Exception e) 
		  {
		 
		  String logs = e.getLocalizedMessage();
		  log.error("Error is :" + logs); }
		  finally {
		  
		 driver.quit(); 
		 log.info("ChromeBrowser is closed");
		  }*/
		 

	}

}
