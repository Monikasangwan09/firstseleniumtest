package windowmanage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserManage {
	
	public static void main(String[] arg)  {
		manageRuleSelenium();
	}
	
	public static void manageRuleSelenium()  {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
	driver.manage().window().maximize();
	
	driver.manage().window().fullscreen();
	
	
		
}

}
