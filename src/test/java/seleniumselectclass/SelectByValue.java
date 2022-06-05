package seleniumselectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectByValue {

	public static void main(String[] arg) {
		selectByValue();
	}
	
	public static void selectByValue() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		
		WebElement dropdnmenu = driver.findElement(By.id("oldSelectMenu"));
		
		Select s = new Select(dropdnmenu);
		s.selectByValue("5");
	}
}
