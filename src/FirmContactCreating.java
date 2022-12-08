


import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class FirmContactCreating {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		
	    System.setProperty("webdriver.chrome.driver", "D:/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		    //Invoking Browser
		driver.get("https://ligna.vercel.app/auth/login?callbackUrl=https%3A%2F%2Fligna.vercel.app%2F");
		    //opening website
		driver.findElement(By.xpath("//*[text()='Login über Microsoft Office']")).click() ;
		
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@data-report-value='Email_Phone_Skype_Entry']")).sendKeys("mert.sertoez@codana.de");
		driver.findElement(By.xpath("//*[@data-report-value='Submit']")).click();
		
		driver.findElement(By.id("i0118")).sendKeys("Selvander41");
		
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@data-report-value='Submit']")).click();
		driver.findElement(By.xpath("//*[@data-report-value='Submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Kontakt erstellen']")).click();
        //driver.findElement(By.xpath("//div/button/svg[@data-testid='FactoryIcon']")).click();		
		driver.findElement(By.xpath("(//*[text()='Firma'])[2]")).click();
		driver.findElement(By.xpath("//*[@name='firmenname']")).sendKeys("Codana") ;
		driver.findElement(By.xpath("//*[@name='mwstNr']")).sendKeys("123456789") ;
		driver.findElement(By.xpath("//*[@name='unternehmensnummer']")).sendKeys("987654321") ;
		//driver.findElement(By.xpath("//*[@name='Partnerschaft']"));
		//Select Ps = new Select(driver.findElement(By.xpath("//div/div[contains(@class, 'css-1z070h5')]")));
		driver.findElement(By.xpath("//div/div[contains(@class, 'css-1z070h5')]")).click();
	
	    ArrayList<WebElement> list=(ArrayList<WebElement>) driver.findElements(By.xpath("//li[contains(@class, 'MuiMenuItem-root')]"));
		
	    for (int i=0; i<list.size();i++) {
	    	list.get(i).click();
           
	    }
	    driver.findElement(By.xpath("//div/div[contains(@class, 'css-1z070h5')]")).click();
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("info@codana.de");
		driver.findElement(By.xpath("//*[@name='emailPrivat']")).sendKeys("info@codana.de");
		driver.findElement(By.xpath("//*[@name='homepage']")).sendKeys("codana.de");
		driver.findElement(By.xpath("//*[@name='telefon']")).sendKeys("+4971316187882");
		driver.findElement(By.xpath("//*[@name='mobil']")).sendKeys("+4971316187882");
		driver.findElement(By.xpath("//*[@name='kommentar']")).sendKeys("Present by Codana");
		driver.findElement(By.xpath("//*[text()='Kontakt Speichern']")).click();
		

	}

}
