import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Miscelleanous {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("sessionKey");
		
		
		
		driver.get("https://www.google.com.tr");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("D:\\Step1.png"));
		
	}

}
