package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

// hooks used to running testing cases after or before certain point
public class Hooks {

	@BeforeAll
	public static void before_all() {
		System.out.println("@Before all -Creating db connection");
	}
	
	
	@AfterAll
	public static void after_all() {
		System.out.println("@after all - Clsoing db connection");
	}
	
	@BeforeStep
	public void before_step() {
		System.out.println("before step- writing logs");
	}
	
	
	@AfterStep
	public void after_step() {
		System.out.println("@after step- deleting logs");
	}
	
	// it will executed before each scenario
	@Before
	public void setup() {
		System.out.println("@before-Launching browser");
	}
	
	
	// it will get executed after each scenario
	@After
	public void tearDown() {
		System.out.println("@after- quiting the browser");
	}
}
