package seleniumactionclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassDoubleClick {


	public static void main(String[] arg) throws InterruptedException {
		doubleClickMethod();
	}
	
	public static void doubleClickMethod() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		//WebElement e = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions ac = new Actions(driver);
		ac.doubleClick(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).perform();	
	//	ac.doubleClick();
		Thread.sleep(2000);
		
		
	}
}
