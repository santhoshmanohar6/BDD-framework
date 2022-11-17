package stepdefenationfile;

import java.awt.Image;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import genericmethod.automationgenaric;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefenation extends automationgenaric {

	@Given("^open the browser (.*)$")
	public void open_the_browser(String browser) {
	    // Write code here that turns the phrase above into concrete actions
		openbrowser(browser);
	}

	@Then("^Enter the url (.*)$")
	public void enter_the_url(String url) {
	    // Write code here that turns the phrase above into concrete actions
		enterurl(url);
	}

	@When("^Enter the fullname (.*)$")
	public void enter_the_fullname(String fullname) {
	    // Write code here that turns the phrase above into concrete actions
		getelementByID("name").sendKeys(fullname);
	}

	@Then("^Enter the business email (.*)$")
	public void enter_the_business_email(String email) {
	    // Write code here that turns the phrase above into concrete actions
		getelementByID("email").sendKeys(email);
	}

	@Then("^Enter the desird password (.*)$")
	public void enter_the_desird_password(String password) {
	    // Write code here that turns the phrase above into concrete actions
		getelementByID("userpassword").sendKeys(password);
	}

	@Then("^select the phonecode (.*)$")
	public void select_the_phonecode(String code) {
	    // Write code here that turns the phrase above into concrete actions
		selecttheelement(getelementByname("country_code"),code);
	}

	@Then("^Enter the phonenumber (.*)$")
	public void enter_the_phonenumber(String phonenumber) {
	    // Write code here that turns the phrase above into concrete actions
		getelementByID("phone").sendKeys(phonenumber);
	}

	@Then("^Click the agree checkbox (.*)$")
	public void click_the_agree_checkbox(String clickoption) {
	    // Write code here that turns the phrase above into concrete actions
		getelementByxpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/form/div[5]/label/samp").click();
	} 

	

}
