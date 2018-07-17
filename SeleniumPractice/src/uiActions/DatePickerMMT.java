package uiActions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DatePickerMMT {
	WebDriver driver;

	@BeforeClass
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\JarFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("hp-widget__depart")).click();

	}

	@Test
	public void selectDate(){
		WebElement table = driver.findElement(By.xpath("//div[@class='filterOptins']/div/div[3]/div/div[1]/table"));
		List<WebElement> col = table.findElements(By.tagName("td"));
		for(WebElement x : col){
			System.out.println(x.getText());
		}
	}
}