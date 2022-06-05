package seleniumselectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectByVisibleText {
	
	public static void main(String[] arg) {
		selectByVisibleText();
	}
	
	public static void selectByVisibleText() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		
		WebElement dropdnmenu = driver.findElement(By.id("oldSelectMenu"));
		
		Select s = new Select(dropdnmenu);
		s.selectByVisibleText("Yellow");
	}

}
