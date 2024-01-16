package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001_LoginStepDefinition {
	WebDriver driver;
	
	@Given("user is on homepage")
	public void user_is_on_homepage() {
	    System.out.println("User is on Home");
	    driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		
		
	}
	@When("user clicks on Signin link")
	public void user_clicks_on_signin_link() {
	    System.out.println("click on Signin link");
	    driver.findElement(By.linkText("Sign in")).click();
	}
	@Then("validate the title")
	public void validate_the_title() {
	    System.out.println("Check title");
	    String title=driver.getTitle();
	    Assert.assertEquals(title,"Rediffmail");
	}
	@When("user enters username")
	public void user_enters_username() {
	    System.out.println("Enter user name");
	    driver.findElement(By.id("login1")).sendKeys("m.arpana1234");
	}
	@When("user enters password")
	public void user_enters_password() {
	    System.out.println("Enter Password");
	    driver.findElement(By.id("password")).sendKeys("arpana123");
	}
	@When("clicks on Submit button")
	public void clicks_on_submit_button() {
	   System.out.println("Click on submit button");
	   driver.findElement(By.name("proceed")).click();
	}
	@Then("valid user display message Login successful")
	public void valid_user_display_message_login_successful() {
	    System.out.println("Login Successful..");
	}
	@Then("logout")
	public void logout() {
	    System.out.println("Logout");
	    driver.quit();
	}
	@When("user enters invalid username and valid password")
	public void user_enters_invalid_username_and_valid_password() {
	    System.out.println("Enter invalid user name and valid password");
	}
	@Then("check for error message")
	public void check_for_error_message() {
	    System.out.println("Error message is displayed");
	}
	@When("user enters valid username and invalid password")
	public void user_enters_valid_username_and_invalid_password() {
	    System.out.println("Enter valid user name and invalid password");
	}






}
