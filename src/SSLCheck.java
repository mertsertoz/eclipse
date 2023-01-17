import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		// options.addExtensions("path"); for opening browser with extensions
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("proxy adress");
		options.setCapability("proxy", proxy);
		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("download.default_directory", "/directory/path");

		options.setExperimentalOption("prefs", prefs);  //download to spesific folder

		options.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver", "D:/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	}

}
