package pages.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsedCar {
	
	@FindBy(xpath="//div[text()=\"Explore Used Cars\"]")
	public WebElement exploreUsedCars;
	
	@FindBy(xpath="//div[text()=\"USED CARS\"]")
	public WebElement usedCarbtn;

	@FindBy(css="[href=\"/used/delhi/")
	public WebElement delhibtn;
	
	
	@FindBy(css="[data-skin=\"title\"]")
	public WebElement title;
}
