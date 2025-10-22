package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locator.CarWaleHomePage;
import utils.SeleniumDriver;

public class CarWaleHomePageActions {
	CarWaleHomePage carwaleHomePage=null;
	
	public CarWaleHomePageActions() {
		
		this.carwaleHomePage=new CarWaleHomePage();
		PageFactory.initElements(SeleniumDriver.getDriver(), carwaleHomePage);
	}
	
	public void ClickOnNewCars() {
		carwaleHomePage.newCarWebElement.click();
		
	}
	
	public void clickOnFindNewCar() {
		carwaleHomePage.FindNewCarWebElement.click();
		
	}
	
	public void clickOnBrand() {
		carwaleHomePage.MahindraWebElement.click();
	}
	
	public void getTitle() {
		carwaleHomePage.pageTitleWebElement.getText();
	}
}
