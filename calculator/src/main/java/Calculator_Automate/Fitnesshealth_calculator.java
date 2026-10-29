package Calculator_Automate;

import org.openqa.selenium.By;

public class Fitnesshealth_calculator extends Setup {
	
	public void fitness() throws InterruptedException {
		openBrowser();
		
		driver.findElement(By.xpath("//a[@href='/fitness-and-health-calculator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='/bmi-calculator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[@href='/calorie-calculator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[@href='/body-fat-calculator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='/bmr-calculator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[@href='/ideal-weight-calculator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[@href='/pace-calculator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='/pregnancy-calculator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[@href='/pregnancy-conception-calculator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[@href='/due-date-calculator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.quit();
		//driver.close();
		
		
		
		
		
		
	}

}

