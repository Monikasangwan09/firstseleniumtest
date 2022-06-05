package seleniumselectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectMultpleValuesFromDropDown {

	
	public static void main(String[] arg) {
		selectMultipleValues();
	}
	
	public static void selectMultipleValues() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		
		WebElement dropdnmenu = driver.findElement(By.xpath("//*[@id='cars']"));
		
		Select s = new Select(dropdnmenu);
		
		if(s.isMultiple()==true){
		s.selectByIndex(0);
		s.selectByIndex(1);
	}
}
}
