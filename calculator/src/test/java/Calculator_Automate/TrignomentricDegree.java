package Calculator_Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TrignomentricDegree extends Setup{

	@Test
	public void trigno() throws InterruptedException {
		openBrowser();
		
		
		
		driver.findElement(By.xpath("//span[text()='sin']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
		Thread.sleep(1000);
		
		//AC
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
		    Thread.sleep(1000);
		    //tan
		    driver.findElement(By.xpath("//span[text()='cos']")).click();
		    driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();
			driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
			Thread.sleep(1000);
			//AC
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
		    Thread.sleep(1000);
		    
		    //tan
		    driver.findElement(By.xpath("//span[text()='tan']")).click();
		    driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();
			driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
		    Thread.sleep(1000);
		    
			//2nd row sin-1
			driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[2]/span[1]")).click();
			driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();
			driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
			Thread.sleep(1000);
			
			//AC
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
			    Thread.sleep(1000);
			    //2rowcos
			    driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[2]/span[2]")).click();
			    driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();
				driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
				Thread.sleep(1000);
				//AC
				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
			    Thread.sleep(1000);
			    
			    //tan
			 // 1. Click on atan
			    driver.findElement(By.xpath("//span[@onclick=\"r('atan')\" and @class='scifunc']")).click();

			    // 2. Click on 8
			    driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();

			    // 3. Click on the element using XPath
			    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();

			    Thread.sleep(1000);

			    // 4. Click on the next element
			    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();

			    Thread.sleep(1000);
			    
			   //pai fucntion:
			    
			    driver.findElement(By.xpath("//span[@onclick=\"r(4)\"]")).click();
			    driver.findElement(By.xpath("//span[@onclick=\"r('pi')\"]")).click();
			    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
			    Thread.sleep(1000);
			    
			    //e
			    driver.findElement(By.xpath("//span[@onclick=\"r('e')\"]")).click();
			    driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
			    Thread.sleep(1000);
			    
			    //xY
			    driver.findElement(By.xpath("//span[@onclick=\"r(4)\"]")).click();
			    driver.findElement(By.cssSelector("span[onclick=\"r('pow')\"]")).click();
			    driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
			    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
			    Thread.sleep(1000);
			    
			    
			    
			    
			    //x3
			    driver.findElement(By.xpath("//span[@onclick=\"r(4)\"]")).click();
			    driver.findElement(By.xpath("//span[@onclick=\"r('x3')\"]")).click();
			    driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
			    Thread.sleep(1000);
			    //x2
			    driver.findElement(By.xpath("//span[@onclick=\"r(4)\"]")).click();
			    driver.findElement(By.xpath("//span[@onclick=\"r('x2')\"]")).click();
			    driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
			    Thread.sleep(1000);
			    
			    
			    //eX
			    
			    driver.findElement(By.xpath("//span[@onclick=\"r('ex')\"]")).click();
			    driver.findElement(By.xpath("//span[@onclick=\"r(4)\"]")).click();
			    driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
			    
			    //10X
			    
			    driver.findElement(By.xpath("//span[@onclick=\"r('10x')\"]")).click();
                driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
                driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
                
                //y/X
                
                driver.findElement(By.xpath("//span[@onclick=\"r(6)\"]")).click();
                driver.findElement(By.xpath("//span[@onclick=\"r('apow')\"]")).click();
                driver.findElement(By.xpath("//span[@onclick=\"r(9)\"]")).click();
                driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
                
                //3/x
                driver.findElement(By.xpath("//span[@onclick=\"r('3x')\"]")).click();
                driver.findElement(By.xpath("//span[@onclick=\"r(6)\"]")).click();
                driver.findElement(By.xpath("//span[@onclick=\"r(9)\"]")).click();
                driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
                
                // /x
                driver.findElement(By.xpath("//span[@onclick=\"r('sqrt')\"]")).click();
                driver.findElement(By.xpath("//span[@onclick=\"r(6)\"]")).click();
                driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
                
                
                //log
                driver.findElement(By.xpath("//span[@onclick=\"r('log')\"]")).click();
                driver.findElement(By.xpath("//span[@onclick=\"r(2)\"]")).click();
                driver.findElement(By.xpath("//span[@onclick=\"r(0)\"]")).click();
                driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
                
                //1/x
                driver.findElement(By.xpath("//span[@onclick=\"r(9)\"]")).click();
                driver.findElement(By.xpath("//span[@onclick=\"r('1/x')\"]")).click();
                driver.findElement(By.xpath("//span[@onclick=\"r('+')\"]")).click();
                driver.findElement(By.xpath("//span[@onclick=\"r(9)\"]")).click();
                driver.findElement(By.xpath("//span[@onclick=\"r('1/x')\"]")).click();
                driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
                
                
                //%
                driver.findElement(By.xpath("//span[@onclick=\"r(9)\"]")).click();
                driver.findElement(By.xpath("//span[@onclick=\"r('pc')\"]")).click();
                driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
                
                
                //factorial
                
                driver.findElement(By.xpath("//span[@onclick=\"r(6)\"]")).click();
                driver.findElement(By.xpath("//span[@onclick=\"r('n!')\"]")).click();
                driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
                
                
                Thread.sleep(2000);
                
			    driver.quit();
			    
			    
	}

}
