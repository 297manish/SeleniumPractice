package uiActions;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestDatePicker {

	WebDriver driver;
	String year = "";
	String month = "";
	String date = "";
	@BeforeClass
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\JarFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.lashopz.com/pie-register-registration");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.className("close-popup")).click();
		
	}
	
	@Test
	public void selectDate(){
		driver.findElement(By.xpath("//img[@class='calendar_icon']")).click();
		WebElement table = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));
		List<WebElement> col = table.findElements(By.tagName("td"));
		System.out.println(col.size());
		for(WebElement x : col){
			if(x.getText().equals("10")){
				x.click();
			}
		}
	}
}
