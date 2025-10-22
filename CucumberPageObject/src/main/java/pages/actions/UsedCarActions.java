package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locator.UsedCar;
import utils.SeleniumDriver;

public class UsedCarActions {
	public UsedCar usedCar=null;
	
	public UsedCarActions() {
		usedCar=new UsedCar();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedCar);
	}
	
	public void usedCarClick() {
		usedCar.usedCarbtn.click();
	};
	
	public void exploreUsedCar() {
		usedCar.exploreUsedCars.click();
	}
	
	public void clickOnCity() {
		usedCar.delhibtn.click();
	}
	
	

}
