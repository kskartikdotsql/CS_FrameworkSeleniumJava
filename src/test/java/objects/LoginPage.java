package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.Locators;

public class LoginPage {
	
	public static WebElement element;
	
	public static WebElement Username(WebDriver driver) {
		element = driver.findElement(Locators.LP_EB_Username);
		return element;
	}
	
	public static WebElement Password(WebDriver driver) {
		element  = driver.findElement(Locators.LP_EB_Password);
		return element;
	}
	
	public static WebElement Sigin(WebDriver driver) {
		element = driver.findElement(Locators.LP_Btn_Login);
		return element;
	}

}
