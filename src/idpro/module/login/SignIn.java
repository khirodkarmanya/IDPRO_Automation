package idpro.module.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SignIn {

	
	@Test
	public void TC001() {
		
		System.out.println("welcome IDpro");
		WebDriver driver=new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver,10);
		driver.get("https://www.fb.com");
	}
	
	
	
}
