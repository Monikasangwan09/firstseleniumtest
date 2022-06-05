package seleniumactionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassClickMethod {

	public static void main(String[] arg) throws InterruptedException {
		simpleClickMethod();
		moveToElementClickMethod();
	}

	public static void simpleClickMethod() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	//	WebElement e = driver.findElement(By.id("nav-search-submit-button"));
	

		Actions ac = new Actions(driver);
		ac.click(driver.findElement(By.id("nav-search-submit-button"))).perform();		
		driver.quit();
	}

	public static void moveToElementClickMethod() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();	

		driver.get("https://www.lambdatest.com/");		
		WebElement e1 = driver.findElement(By.linkText("Platform"));

		Actions ac = new Actions(driver);
		ac.moveToElement(e1).perform();

		Thread.sleep(2000);

		WebElement e2 = driver.findElement(By.xpath("//*[@id='header']/nav/div/div/div[2]/div/div/div[1]/div[1]/div/div[1]/div/div[1]/div/div[1]/ul/li[4]/a/div/div[2]/h3"));
		ac.click(e2).perform();		



	}

}
