import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class homework5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		
		
		String text = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]")).getText();
		
		
		WebElement staticDropDown = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(staticDropDown);
		dropdown.selectByVisibleText(text);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(text);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		
		String alert = "driver.switchTo().alert()";
		
		if(text.contains(text)) {
			System.out.println("Alert message is succes");
		}
		else
		{
			System.out.println("Something went wrong");
		}
		
	}

}
