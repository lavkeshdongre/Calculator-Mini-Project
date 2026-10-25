package Calci;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
@Test
public class AdditionOperation extends Setup{
 public void Add() throws InterruptedException {
	 openBrowser() ;
	 
		driver.findElement(By.xpath("//span[@onclick='r(7)']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
	    Thread.sleep(3000);
	    driver.quit();
 }
}
