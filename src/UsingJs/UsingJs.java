package UsingJs;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class UsingJs {
public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		WebDriver driver = new ChromeDriver(option.addArguments("--disable-notifications"));
		driver.get("https://www.irctc.co.in/nget/train-search");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> li = driver.getWindowHandles();
		for (String child : li) {
			if (!parent.equals(child)) {
				driver.switchTo().window(child);
				driver.close();
			}

		}
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("\"document.getElementById(\"block\").click();\"");
		js.executeAsyncScript("window.scrollBy(0,5000)");
	}

}
