import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsMethods {
public static void main(String[] args) {
	WebDriver dre=new ChromeDriver();
	dre.get("https://www.facebook.com/ ");
	JavascriptExecutor jsa=(JavascriptExecutor)dre;
	jsa.executeAsyncScript("window.scrollBy(0,200)");
	//jsa.executeAsyncScript("window.scrollBy(0,-400)");

}
}
