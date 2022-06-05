package seleniumactionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassScrollUpDown {
	
	public static void main(String[] arg) throws InterruptedException {
		scrollUpDownMethod();
	}

	public static void scrollUpDownMethod() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/");

		Actions ac = new Actions(driver);
		ac.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		
		Thread.sleep(2000);
		
		ac.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		
	}


}
