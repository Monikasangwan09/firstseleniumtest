package seleniumactionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassKeyDownCase {

	public static void main(String[] arg) {
		typeUpperCaseMethod();
	}

	public static void typeUpperCaseMethod() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		WebElement e = driver.findElement(By.name("q"));

		Actions ac = new Actions(driver);
		ac.keyDown(e,Keys.SHIFT).sendKeys("Kaju sheoran").build().perform();
		

	}

}
