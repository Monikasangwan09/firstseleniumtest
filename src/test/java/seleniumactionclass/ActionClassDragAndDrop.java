package seleniumactionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassDragAndDrop {

	public static void main(String[] arg) {
		dragDropMethod();
	}
	
	public static void dragDropMethod() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		
		WebElement source = driver.findElement(By.xpath("//*[@id='drag1']"));
		WebElement destination = driver.findElement(By.xpath("//*[@id='div2']"));
		
		Actions ac = new Actions(driver);
		ac.moveToElement(source);
        ac.clickAndHold(source).moveToElement(destination).release().build().perform();		
      
		
		
		
	}
}
