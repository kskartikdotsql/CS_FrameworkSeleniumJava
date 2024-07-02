package repository;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import objects.InventoryPageAfterLogin;
import objects.LoginPage;

public class Repository {
	
	static WebDriver driver;
	
	//Login
	public static void Login() {
		LoginPage.Username(driver).sendKeys("standard_user");
		LoginPage.Password(driver).sendKeys("secret_sauce");
		LoginPage.Sigin(driver).click();
	}
	
	//Launch
	public static void Launch() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/index.html");
//		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//		wait.until(d -> InventoryPageAfterLogin.SearchBoxContainer(driver).isDisplayed());
		Thread.sleep(3000);
	}
	
	
	//Close app
	public static void TearDown() {
		driver.close();
		driver.quit();
	}

}
