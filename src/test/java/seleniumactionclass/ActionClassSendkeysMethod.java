package seleniumactionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassSendkeysMethod {
	
	public static void main(String[] arg) {
		typeMethod();
	}
	
	public static void typeMethod() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement e = driver.findElement(By.id("twotabsearchtextbox"));
		
		Actions ac = new Actions(driver);
		ac.sendKeys(e, "iphone 13").build().perform();
		driver.quit();
	}

}
