package Calci;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Calculator_Automate.Setup;

public class Trignomentricopration extends Setup{
	
	public void trigno() throws InterruptedException {
		openBrowser();
		
		driver.findElement(By.xpath("//span[text()='sin']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
		Thread.sleep(1000);
		
		
		
		
	}

}
