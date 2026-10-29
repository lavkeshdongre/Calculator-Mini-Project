package Calculator_Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Division extends Setup {

public void div() throws InterruptedException {
	
	    openBrowser();
	    driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();
	    WebElement Divide=driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[4]"));
	    Divide.click();
	    driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
	    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
	    Thread.sleep(1000);
	    driver.quit();
	    
	    
	    
}
}
