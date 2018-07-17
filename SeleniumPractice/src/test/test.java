package test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\JarFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
			
		wait.until(ExpectedConditions.tex);
		
		wait.until(ExpectedConditions.)
		*/
		
	//	Select s = new Select(driver.findElement(By.id("Carlist")));
		 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy-HH/mm/ss");  
		    Date date = new Date();  
		    System.out.println(formatter.format(date));  
		
	}

}
