import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebDriverWait x = new WebDriverWait(driver, Duration.ofSeconds(5)); // driver for explicit wait

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Brinjal" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		Thread.sleep(3000);
		addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode"))); // explicit wait
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();

		x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		int j = 0;
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-"); // for the splitting the name of a product
			String formattedName = name[0].trim(); // for the deleting white spaces

			// convert array into arraylist for easy search
			// check whether name you extracted is present in arraylist or not

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName)) {

				j++;

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded.length) {
					break;
				}

			}
		}
	}

}
