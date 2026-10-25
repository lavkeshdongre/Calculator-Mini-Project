package Calci;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class Setup {
  ChromeDriver driver;
  public void openBrowser() {
	 //here we done the setup
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.calculator.net/");
	 
 }
}
