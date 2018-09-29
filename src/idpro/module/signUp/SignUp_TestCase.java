package idpro.module.signUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import idpro.generic.lib.IDPRO_APP_Library;
import idpro.generic.lib.Idpro_AppData;

public class SignUp_TestCase extends Idpro_AppData{
	
	WebDriver driver;
	
	IDPRO_APP_Library appLib;
	@BeforeClass
	public void beforClass() {
		driver = new ChromeDriver();
		appLib = new IDPRO_APP_Library();
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		driver.get(appUrl);
		appLib.navigateToSignUpPage(driver);
//		
	}
	
	@Test
	public void TC_001() {//(String firstName, String lastName, String mobileNum, String email, String password, String confirmPassword) {// Validating the successfull signUp.
		
		driver.findElement(By.id("FirstName")).sendKeys("Nihar");
		driver.findElement(By.id("LastName")).sendKeys("Sahu");//
		driver.findElement(By.id("Mobile")).sendKeys("1234567799");
		driver.findElement(By.id("Email")).sendKeys("kkkk@k.com");
		driver.findElement(By.id("Password")).sendKeys("1!Qwerty");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("1!Qwerty");
		driver.findElement(By.id("SignupFormSubmit")).click();
		
		String expected = "Registration successful. Enter OTP which is sent to your mobile.";
		String actual = driver.findElement(By.xpath("//div[@class = 'alert alert-success']/p")).getText();

		Assert.assertEquals(actual, expected);
		
	}
	@Test(enabled = false)
	public void TC_002() {
		Assert.assertTrue(false);
		
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
		driver = null;
	}
	
	@AfterMethod
	public void afterMethod(ITestResult it) {
		System.out.println(it.getMethod().getMethodName());
		if(!it.isSuccess()) {
			appLib.takeScreenShot(driver, it.getMethod().getMethodName());
		}
		
		
	}

}
