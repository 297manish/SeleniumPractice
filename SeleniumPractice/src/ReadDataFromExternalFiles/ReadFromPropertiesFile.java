package ReadDataFromExternalFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadFromPropertiesFile {

	WebDriver driver;
	@Test
	public void read() throws IOException{
		File f = new File("C:\\Selenium\\Workspace\\SeleniumPractice\\src\\ReadDataFromExternalFiles\\test.properties");
		FileInputStream fis = new FileInputStream(f);
		
		Properties p = new Properties();
		p.load(fis);
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("chrome.browser.key"));
		System.out.println(p.getProperty("chrome.exe.location"));
		System.setProperty(p.getProperty("chrome.browser.key"), p.getProperty("chrome.exe.location"));
		/*driver = new ChromeDriver();
		driver.get(p.getProperty("url"));*/
		
		FileOutputStream fos = new FileOutputStream(f);
		p.setProperty("country", "India");
		p.setProperty("country", "USA");
		p.store(fos, "");
		fos.close();
		
		
		
		
	}
}
