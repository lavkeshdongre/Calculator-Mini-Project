package Calci;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Multiplication extends Setup{
	
	public void mul() throws InterruptedException {
		openBrowser();
		 driver.findElement(By.xpath("//span[@onclick='r(6)']")).click();
		  WebElement Multiply =  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[4]"));
		  Multiply.click();
		    driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
		    
		    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
		    Thread.sleep(1000);
		    
		    driver.quit();
		
	}

}
