package seleniumactionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassPageRefresh {
	
	
		public static void main(String[] arg) throws InterruptedException {
			pageRefreshMethod();
		}

		public static void pageRefreshMethod() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
						
			Actions ac = new Actions(driver);
			
			ac.keyDown( Keys.SHIFT).sendKeys( Keys.F5 ).perform();
						
		}

}
