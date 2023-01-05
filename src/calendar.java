import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calendar {

	public static void main(String[] args) throws InterruptedException

	{

		System.setProperty("webdriver.chrome.driver", "D:/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");

		// Scroll the Page
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,800)");

		Thread.sleep(4000);

		driver.findElement(By.id("form-field-travel_comp_date")).click();

		WebElement month = driver.findElement(By.xpath("//div[@class='flatpickr-month']"));

		while (!month.getText().contains("April"))

		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
			;

		}

		int count = driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).size();

		for (int i = 0; i < count; i++)

		{

			String text = driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).get(i).getText();

			if (text.equalsIgnoreCase("26"))

			{

				// driver.findElements(By.cssSelector("td[class*='day']")).get(i).click();

				driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).get(i).click();

				System.out.println(text);

				break;

			}

		}

		String date = driver.findElement(By.xpath("//*[@id='form-field-travel_comp_date']")).getAttribute("value");

		System.out.println("The select date is:" + date);

	}

}