package seleniumalerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertMethods {


	public static void main(String[] arg) throws InterruptedException {
		alertMethod();
	}
	
	public static void alertMethod() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement e = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions ac = new Actions(driver);
		ac.doubleClick(e).perform();	
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		//alert.dismiss();
		
		//alert.sendKeys("Kaju");
		
		String alerttext = alert.getText();
		System.out.println("Alert Text\n" + alerttext);
		Thread.sleep(2000);
		driver.quit();
	}
}
