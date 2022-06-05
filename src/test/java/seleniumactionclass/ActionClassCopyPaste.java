package seleniumactionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassCopyPaste {
	
	public static void main(String[] arg) throws InterruptedException {
		copypasteMethod();
	}

	public static void copypasteMethod() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.triptoomanonline.com/vform.php");
		
		driver.findElement(By.id("city")).sendKeys("Kaju");
	//	WebElement state = driver.findElement(By.id("state"));
		
		
		
		Actions ac = new Actions(driver);
		
		ac.keyDown( Keys.CONTROL ).sendKeys( "a" ).keyUp( Keys.CONTROL ).build().perform();
		ac.keyDown( Keys.CONTROL ).sendKeys( "c" ).keyUp( Keys.CONTROL ).build().perform();
		
		Thread.sleep(2000);
		driver.findElement(By.id("state")).click();
		
		ac.keyDown( Keys.CONTROL ).sendKeys( "v" ).keyUp( Keys.CONTROL ).build().perform();
		
		
	}

}
