import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size()); //shows how many links we have in this website 
		
		WebElement footerDriver=driver.findElement(By.id("gf-BIG")); //create a webElement for footer and limit the webdriver scope
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		WebElement columnDriver=footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size()); //limit the webElement we created and scope it
		
		for(int i=1; i<columnDriver.findElements(By.tagName("a")).size();i++)
		{
			
			String clickOnLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(4000);
		}
			Set<String> abc=driver.getWindowHandles();
			Iterator<String> it=abc.iterator();
		
			while(it.hasNext()) {
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		}
		
	
	
	}
	

