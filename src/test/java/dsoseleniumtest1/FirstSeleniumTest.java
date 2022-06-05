package dsoseleniumtest1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumTest {
	@Test
	public static void facebookLogin() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.get("https://en-gb.facebook.com/");
		cdriver.manage().window().maximize();
		cdriver.findElement(By.id("email")).sendKeys("monica.bsangwan@gmail.com");
		cdriver.findElement( By.id("pass")).sendKeys("monika");
		Thread.sleep(1000);
		
		cdriver.findElement(By.name("login")).click();
		
		WebElement login = cdriver.findElement(By.name("login"));
		login.click();
		
		
	}

	

}
