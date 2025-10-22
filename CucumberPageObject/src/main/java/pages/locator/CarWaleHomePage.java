package pages.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarWaleHomePage {

	
	@FindBy(xpath="//div[text()=\"NEW CARS\"]")
	public WebElement newCarWebElement;
	
	@FindBy(xpath="//div[text()=\"Find New Cars\"]")
	public WebElement FindNewCarWebElement;
	
	@FindBy(css="[title=\"Mahindra\"]")
	public WebElement MahindraWebElement;
	
	@FindBy(css="h2[data-skin=\"text\"]")
	public WebElement pageTitleWebElement;
	

}
