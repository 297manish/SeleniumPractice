package uiActions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import HelperPack.Helper;

public class ScreenShot extends Helper{
	WebDriver driver;
	@BeforeClass
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\JarFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


	}
	@Test
	public void VerifyTitle() throws IOException{
		System.out.println("A");
		String name = Thread.currentThread().getStackTrace()[1].getMethodName();
		screenShot(driver, name);
	}

	@Test
	public void verifyUrl() throws IOException{
		System.out.println("B");
		String name = Thread.currentThread().getStackTrace()[1].getMethodName();
		screenShot(driver, name);
	}
	@AfterClass
	public void end(){
		driver.quit();
	}



}
