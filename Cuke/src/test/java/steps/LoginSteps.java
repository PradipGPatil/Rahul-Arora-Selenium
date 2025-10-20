package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	// intial We are running file like right on project-> run->run configuration-> cucumber-> adding feature file and click on run
	
	// instead of doing this we can add runner file 

	@Given("when user enter the url")
	public void when_user_enter_the_url() {

	}

	@When("User validate Home page title")
	public void user_validate_home_page_title() {

	}

	@Then("user enter {string} username")
	public void user_enter_username(String username) {
		System.out.println(username);
	}

	// notice we have used string as small
	//All placeholders are lowercase.
	@And("user enter {string} password")
	public void user_enter_password(String password) {
		System.out.println(password);

	}

	@And("User click on Sign in Button")
	public void user_click_on_sign_in_button() {
;
	}

}
