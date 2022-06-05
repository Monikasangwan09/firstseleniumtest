package seleniumactionclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassRightClick {
	
	public static void main(String[] arg) {
		rightClickMethod();
	}
	
	public static void rightClickMethod() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement e = driver.findElement(By.xpath("//button[text()='right click me']"));
		
		Actions ac = new Actions(driver);
		ac.contextClick(e);
		//ac.contextClick();
		
	}

}
