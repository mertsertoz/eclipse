import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SellIntroduction {

	public static void main(String[] args) {
        
		//Invoking browser
	    //Chrome - ChromeDriver ->Methods
		
		
		//chromediver.exe -> Chrome browser
		//webdriver.chrome.driver -> value of path 
		System.setProperty("webdriver.chrome.driver" , "D:/driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());		
		System.out.println(driver.getCurrentUrl());
		
	}

}
