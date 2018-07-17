package HelperPack;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {

	public void screenShot(WebDriver driver, String name) throws IOException{
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Selenium\\Test\\"+name+timeStamp()+".png"));
	}
	
	public String timeStamp(){
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");  
	    Date date = new Date();  
	    System.out.println(formatter.format(date)); 
	    String ts = formatter.format(date);
	    return ts;
	}
	
	
}
