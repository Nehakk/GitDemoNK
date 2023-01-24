package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

	@Given("^User is on Net banking landing page$")
	public  void user_is_on_NetBanking_Landing()
	{
		System.out.println("navigated to home page");	
	}
	
	@Given("^User is on Loan banking landing page$")
	public  void user_is_on_Loan_banking_Landing_page()
	{
		System.out.println("navigated to loan page");		
	}
	
	
	@Given("^Validate the browser$")
	public void validate_the_browser() {
	    System.out.println("Browser is validated");
	    
	}
	@When("^Browser is triggered$")
	public void browser_is_triggered() {
		 System.out.println("Browser is triggered");
	    
	}
	@Then("^check if browser is started$")
	public void check_if_browser_is_started() {
		 System.out.println("Browser is started");
	    
	}



	@When("User Login in aplication with username {string} and password {string}")
	public void user_login_in_aplication_with_username_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(string);
	    System.out.println(string2);
	}
	//@When("User sign up with following details")
	//public void user_sign_up_with_following_details(io.cucumber.datatable.DataTable dataTable) throws Throwable {
	 // List obj=dataTable.asList();	
	  //System.out.println(obj.get(0).get(0));
	  //System.out.println(obj.get(0).get(1));
	  //System.out.println(obj.get(0).get(2));
	  //System.out.println(obj.get(0).get(3));
	  //System.out.println(obj.get(0).get(4));
	  
	//}
	@When("^User login with (.+) and  (.+)$")
	public void user_login_with_and_(String UserName,String password) {
		System.out.println(UserName);
		System.out.println(password);
		
	        
	}

	
	@Then("^Home Page is populated$")
	public  void Home_Page_is_populated()
	{
		System.out.println("Home page is populated");		
	}
	
	
	
}

