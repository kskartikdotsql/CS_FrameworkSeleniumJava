package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.Locators;

public class InventoryPageAfterLogin {
	
	public static WebElement element;
	
	public static WebElement SearchBoxContainer(WebDriver driver) {
		element = driver.findElement(Locators.IP_SearchBoxContainer);
		return element;
	}

}
