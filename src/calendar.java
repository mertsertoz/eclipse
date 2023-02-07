import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calendar {

	public static void main(String[] args) throws InterruptedException

	{

		String url = "https://www.path2usa.com/travel-companion";

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "D:/driver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		// Scroll the Page

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,1100)");

		Thread.sleep(2000);

		WebElement name = driver.findElement(By.id("form-field-travel_from"));
		
		name.sendKeys("Las");
		
		Thread.sleep(2000);
		WebElement nameDrop = driver.findElement(By.cssSelector("li[class='ui-menu-item']"));
		nameDrop.click();
		/*List<WebElement> dropLists = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));

		for (WebElement dropList : dropLists) {
			if (dropList.getText().contains("Las Vegas")) {
				dropList.click();
				break;
			}
		}*/

		

		WebElement Date = driver.findElement(By.xpath("//*[@id='form-field-travel_comp_date']"));

		// js.executeScript("arguments[0].scrollIntoView(true);", Date);

		Date.click();

		// WebElement month =
		// driver.findElement(By.xpath("//div[@class='flatpickr-month']"));

		while (!driver.findElement(By.xpath("//div[@class='flatpickr-month']")).getText().contains("April"))

		{

			Thread.sleep(2000);

			driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();

		}

		int count = driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).size();

		for (int i = 0; i < count; i++)

		{

			 

			String text = driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).get(i).getText();

			if (text.equalsIgnoreCase("26"))

			{

				driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).get(i).click();

				System.out.println("The select day is:" + text);

				break;

			}

		}

		String date = driver.findElement(By.xpath("//*[@id='form-field-travel_comp_date']")).getAttribute("value");

		System.out.println("The select date is:" + date);

	}

}