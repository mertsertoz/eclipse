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
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("besttester@codana");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("mertsertoz@hotmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("123456");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		
		
		
	}

}
