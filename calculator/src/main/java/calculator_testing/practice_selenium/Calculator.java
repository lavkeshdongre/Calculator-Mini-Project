package calculator_testing.practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {

	public static void main(String[] args) throws InterruptedException {
		
		
		
					ChromeDriver driver = new ChromeDriver();
					
					driver.manage().window().maximize();
					
					driver.get("https://www.calculator.net/");
					
					//ADITION
					driver.findElement(By.xpath("//span[@onclick='r(7)']")).click();
				    Thread.sleep(1000);
				    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[4]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
					driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
				    Thread.sleep(3000);
				    
				    //Clearbutton
				    
				    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
				    Thread.sleep(1000);
			
				    //Subtraction
				    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[1]")).click();
				    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
				    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();
				    driver.findElement(By.xpath("//span[@onclick='r(9)']")).click();
				    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
				    
				    //clearbutton
				    
				    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
				    
				    //MUltiplication
				    driver.findElement(By.xpath("//span[@onclick='r(6)']")).click();
				    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[4]")).click();
				    driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
				    
				    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
				    
				    
				    //clearebutton
				    
				    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
				    
				    //division
				    
				    driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();
				    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[4]")).click();
				    driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
				    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
				    Thread.sleep(1000);
			
					driver.close();
					
				}

			}



