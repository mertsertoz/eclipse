

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PersonContactCreating {
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver", "D:/driver/chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
		
		driver.get("https://ligna.vercel.app/auth/login?callbackUrl=https%3A%2F%2Fligna.vercel.app%2F");
		
		driver.findElement(By.xpath("//*[text()='Login über Microsoft Office']")).click() ;
		
	    Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@data-report-value='Email_Phone_Skype_Entry']")).sendKeys("mert.sertoez@codana.de");
		driver.findElement(By.xpath("//*[@data-report-value='Submit']")).click();
		
		driver.findElement(By.id("i0118")).sendKeys("Selvander41");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@data-report-value='Submit']")).click();
		driver.findElement(By.xpath("//*[@data-report-value='Submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Kontakt erstellen']")).click() ;
		driver.findElement(By.xpath("//*[@name='vorname']")).sendKeys("Mert") ;
		driver.findElement(By.xpath("//*[@name='name']")).sendKeys("Sertöz") ;
		driver.findElement(By.xpath("//*[@name='funktion']")).sendKeys("Tester") ;
		driver.findElement(By.xpath("//*[@name='spracheId']")).click() ;
		driver.findElement(By.xpath("//div//select//option[@value='EN']")).click() ;       
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("mert.sertoz@live.com") ;
		driver.findElement(By.xpath("//*[@name='emailPrivat']")).sendKeys("mertsertoz@hotmail.com") ;
		driver.findElement(By.xpath("//*[@name='homepage']")).sendKeys("codana.de") ;
		driver.findElement(By.xpath("//*[@name='telefon']")).sendKeys("05346423311") ;
		driver.findElement(By.xpath("//*[@name='mobil']")).sendKeys("05346423311") ;
		driver.findElement(By.xpath("//*[@name='mobilPrivat']")).sendKeys("05346423311") ;
		driver.findElement(By.xpath("//*[@name='kommentar']")).sendKeys("Automation is cool") ;
		driver.findElement(By.xpath("//*[text()='Kontakt Speichern']")).click() ;
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Kontakt löschen']")).click() ;
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
	 }
	
}


