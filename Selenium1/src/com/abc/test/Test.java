package com.abc.test;

import java.io.IOException;
import java.time.zone.ZoneOffsetTransitionRule.TimeDefinition;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Ali/Desktop/selenium%20component/Naukri.html");
		driver.findElement(By.id("fileinfo")).click();
		Thread.sleep(7000);
		Runtime.getRuntime().exec("C:\\Users\\Ali\\Desktop\\AutoIt\\nagendra.exe");
		
	}

}
