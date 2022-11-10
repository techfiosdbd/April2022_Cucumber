package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.TestBase;



import org.openqa.selenium.support.PageFactory;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.Background;
import pages.TestBase;

public class BackgroundStepDefination extends TestBase {
	
	Background backgroundObj;
	
	@Before
	public void beforeRun() {
		
		initDriver();
		backgroundObj = PageFactory.initElements(driver, Background.class);
		
	}

	
	@Given("^User able see \"([^\"]*)\" button exists$")
	public void user_able_see_button_exists(String arg1)  {
		backgroundObj.clickSignInButton1();
	}

	@When("^User able to  click on the button$")
	public void user_able_to_click_on_the_button()  {
		backgroundObj.clickSignInButton2();
	}

	@Then("^User should able to see background color change to sky blue$")
	public void user_should_able_to_see_background_color_change_to_sky_blue()  {
	//	Assert.assertEquals("This is SkyBlue Background", backgroundObj.equals("SkyBlue Background"));
	}

	@Then("^User should able to see background color change to white$")
	public void user_should_able_to_see_background_color_change_to_white() {
		//Assert.assertEquals("This is White Background ", backgroundObj.equals("White Background"));
	}


}