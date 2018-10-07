package idpro.generic.lib;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class IDPRO_APP_Library {
	
	public void login(WebDriver driver, String userName, String password) {
		
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);

		
	}
	public void navigateToSignUpPage(WebDriver driver) {
		
		driver.findElement(By.xpath("//a[text() = 'Sign Up']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void takeScreenShot(WebDriver driver, String testCaseName) {
		
		 TakesScreenshot scrShot =((TakesScreenshot)driver);
		
		//TakesScreenshot sc = (TakesScreenshot)driver;
		
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("/home/khirod/eclipse-workspace/IDPRO/Screenshot/"+testCaseName+".png");
		
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
