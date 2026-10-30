package Calculator_Automate;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Othe_cal extends Setup {
	@Test
	public void others_calculator() throws InterruptedException {
		openBrowser();
		
		driver.findElement(By.xpath("//a[@href='/other-calculator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[@href='/age-calculator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[@href='/date-calculator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='/time-calculator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[@href='/hours-calculator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[@href='/gpa-calculator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='/grade-calculator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[@href='/concrete-calculator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[@href='/ip-subnet-calculator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='/password-generator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[@href='/conversion-calculator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.quit();
		
		
	
		
	}

}
