package Calculator_Automate;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Setup {
	
  ChromeDriver driver;
  @BeforeMethod
  public void openBrowser() {
	 //here we done the setup
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.calculator.net/");
	 
 }
}
