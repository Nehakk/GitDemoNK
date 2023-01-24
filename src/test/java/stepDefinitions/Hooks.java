package stepDefinitions;

import io.cucumber.java.Before;

public class Hooks {
	@Before("@MobileTest")
	public void beforeValidation()
	{
	System.out.println("Mobile Test prerequest code");
	}

}
