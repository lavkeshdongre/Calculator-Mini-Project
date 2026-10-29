package Calculator_Automate;

import org.openqa.selenium.By;

public class Financialcalculator extends Setup{
	public void financial() throws InterruptedException {
		openBrowser();
		
		driver.findElement(By.xpath("//a[@href='/financial-calculator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='/mortgage-calculator.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='/loan-calculator.html']")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='/auto-loan-calculator.html\']")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='/interest-calculator.html']")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='/payment-calculator.html']")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[@href='/retirement-calculator.html']")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='/amortization-calculator.html']")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='/investment-calculator.html']")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='/inflation-calculator.html']")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='/finance-calculator.html']")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='/tax-calculator.html']")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='/compound-interest-calculator.html']")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='/salary-calculator.html']")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='/interest-rate-calculator.html']")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='/sales-tax-calculator.html']")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.close();
	}
	

}
