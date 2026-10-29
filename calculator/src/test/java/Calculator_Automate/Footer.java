package Calculator_Automate;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Footer extends Setup {
	@Test
	public void Droplink() throws InterruptedException {
		openBrowser();
		driver.findElement(By.xpath("//a[@href='/about-us.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[@href='/sitemap.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='/about-us.html#terms']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='/about-us.html#privacy']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='//www.calculator.net']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.quit();		
		
		
		
		
	}
	
	

}
