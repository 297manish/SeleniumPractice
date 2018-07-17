package testFileUploadDownload;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestFileDownload {

	@Test
	public void fileDownload(){
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\JarFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/yahoo.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement download = driver.findElement(By.id("messenger-download"));
		String source_location = download.getAttribute("href");

		String wget_command = "cmd /c C:\\Selenium\\JarFiles\\Wget\\wget.exe -P C:\\Selenium\\TestDownload : --no-check-certificate " + source_location;

		try {
			Process exec = Runtime.getRuntime().exec(wget_command);
			int exitVal = exec.waitFor();
			System.out.println("Exit value: " + exitVal);
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
		driver.close();
	}

}

