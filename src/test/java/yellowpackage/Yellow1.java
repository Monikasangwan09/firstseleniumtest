package yellowpackage;
import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Yellow1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		click();
		
		int a=10;
		int b=20;{
			
		System.out.println(a+b);
		}

	}

	private static void click() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.findElement(By.id("button"));
		
		//WebElement savebutton=(driver.findElement(By.linkText("SAVE")));
		
		WebElement search= (driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div[1]/div[1]/input")));
	
		 
	
		
			
			
			
			Actions ac= new Actions(driver);
			//ac.click( search).perform();
			//ac.click(driver.findElement(By.id("nav-search-submit-button"))).perform();	
			Thread.sleep(2000);
		ac.sendKeys(search,"monika").perform();
		//ac.keyDown(Keys.CONTROL)
		
		 
		
		
	}

}
