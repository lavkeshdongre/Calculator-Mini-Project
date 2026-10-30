package Calculator_Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Subtraction extends Setup {
	@Test
 public void Sub() throws InterruptedException {
	 
	   openBrowser();
	    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[1]")).click();
	    WebElement Subbtract= driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]"));
	    Subbtract.click();
	    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();
	    driver.findElement(By.xpath("//span[@onclick='r(9)']")).click();
	    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
	    Thread.sleep(1000);
	    driver.quit();
 }
}
