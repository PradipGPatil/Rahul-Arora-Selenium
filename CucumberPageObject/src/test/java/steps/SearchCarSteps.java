package steps;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.CarWaleHomePageActions;
import utils.SeleniumDriver;

public class SearchCarSteps {
	CarWaleHomePageActions carWaleHomePageActions=new CarWaleHomePageActions();

	@Given("I am on the home page {string}")
	public void i_am_on_the_home_page(String webUrl) {
		SeleniumDriver.openPage(webUrl);
	}

	@When("I move to the menu")
	public void i_move_to_the_menu(List<String> list) {
		String menu = list.get(1);
		System.out.println("menu selected"+menu);
		
	}

	@And("i click on new cars")
	public void i_click_on_new_cars() {
		carWaleHomePageActions.ClickOnNewCars();
	}

	@And("I select find new cars")
	public void i_select_find_new_cars() {
	  carWaleHomePageActions.clickOnFindNewCar();
	}

	@And("I click on {string} brand option")
	public void i_click_on_brand_option(String brandName) {
	  carWaleHomePageActions.clickOnBrand();
	}

	@Then("I should see all {string} cars")
	public void i_should_see_all_cars(String string) {
		System.out.println("see all car metho");
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string) {
	   carWaleHomePageActions.getTitle();
	}

}
