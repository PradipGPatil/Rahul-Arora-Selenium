package steps;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.And;

public class LoginStepProduction {
	
	
	@And("user enter firstName and LastName")
	public void user_enter_first_name_and_last_name(io.cucumber.datatable.DataTable dataTable) {
//		List<List<String>>data=dataTable.asLists();
//		// printing first row and column
//		
//		System.out.println("First name is : "+data.get(0).get(0)+ " Last Name is "+data.get(0).get(1));
//		
//		// printing second row and column
//		System.out.println("First name is : "+data.get(1).get(0)+ " Last Name is "+data.get(1).get(1));
		
//		List<Map<String, String>> map = dataTable.asMaps();
//		System.out.println(map.get(0).get("firstName")+"---"+ map.get(0).get("LastName"));
//		System.out.println(map.get(1).get("firstName")+"---"+ map.get(1).get("LastName"));
		
		for(Map<String,String>data:dataTable.asMaps(String.class, String.class)) {
			System.out.println(" first name "+data.get("firstName")+"-- last name :"+data.get("LastName"));
		}
	}

	
	@And("User click on check of captcah image")
	public void user_click_on_check_of_captcah_image() {
		System.out.println("User click on captcha");
	}
}
