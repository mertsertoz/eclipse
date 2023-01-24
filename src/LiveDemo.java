import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//click on the column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//capture all the webelements into list
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
		
		//capture text of all webelements into new list -> original list
		List<String> originalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort in the list step 3 -> sorted list
		List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
		
		//compare original list vs sorted list
		Assert.assertTrue(originalList.equals(sortedList));
		
		
	}

}
