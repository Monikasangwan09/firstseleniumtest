package seleniumwindowandtab;

import java.awt.Window;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowAndTabMethods {
	public static void main(String[] arg) {
		tabMethod();
	}
	
	public static void tabMethod() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
	
	    driver.get("http://www.google.co.uk/");
	    driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");

	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(0)); //switches to new tab
	    
	    driver.get("https://www.facebook.com");
	    
	    driver.switchTo().window(tabs.get(0)); // switch back to main screen        
	    driver.get("https://www.news.google.com");
	    
	    
	//    driver.switchTo().newWindow(WindowType.TAB);
	 //   driver.switchTo().newWindow(WindowType.WINDOW);
	}
	
	

}
