package seleniumselectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetOptions {
	
	public static void main(String[] arg) throws InterruptedException {
		getAllOptions();
	}
	
	public static void getAllOptions() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		
		WebElement dropdnmenu = driver.findElement(By.xpath("//*[@id='cars']"));
		
		Select s = new Select(dropdnmenu);
		List<WebElement> options = s.getOptions();
		for(WebElement element : options) {
			System.out.println(element.getText());
		}
}
}
