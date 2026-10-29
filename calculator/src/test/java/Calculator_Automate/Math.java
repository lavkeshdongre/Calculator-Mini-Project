package Calculator_Automate;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Math extends Setup{
	@Test
	public void mathematics() throws InterruptedException {
		openBrowser();
		
		driver.findElement(By.xpath("//a[@href='/math-calculator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[@href='/scientific-calculator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[@href='/fraction-calculator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='/percent-calculator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[@href='/random-number-generator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[@href='/triangle-calculator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[@href='/standard-deviation-calculator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.quit();
		
	}

}
