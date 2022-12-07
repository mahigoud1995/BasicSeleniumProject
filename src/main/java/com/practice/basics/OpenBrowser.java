package com.practice.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//***************Opening a browser by using chromedriver.exe file ***************//
		
//		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com");
//		String currentURl = driver.getCurrentUrl();
//		System.out.println(currentURl);
//		Thread.sleep(2000);
//		
		
		
		//***************Opening a browser by using WebDriverManager ***************//
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String currentURl = driver.getCurrentUrl();
		System.out.println(currentURl);
		Thread.sleep(2000);
		
		
		driver.quit();
	}

}
