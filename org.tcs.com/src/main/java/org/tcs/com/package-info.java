package org.tcs.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\renuk\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		 	driver.manage().window().maximize();
		 	driver.get("https://www.facebook.com/");
		 	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 	Actions act=new Actions(driver);