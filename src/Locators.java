import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Css selector
		//Class name -> tagname.classname -> button.signInBtn
		//id-> tagname#id -> input#inputUsername //
		//Tagname[attribute='value']  input[placeholder='Username']
		//----------------------------------------------------------
		//Xpath
		// //Tagname[@attribute='value']
		// 
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:/driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("mert");
		driver.findElement(By.name("inputPassword")).sendKeys("helloworld123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Mert");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("mertsertoz@hotmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("123456789");
		
		
		
		
		
		
		
	}

}
