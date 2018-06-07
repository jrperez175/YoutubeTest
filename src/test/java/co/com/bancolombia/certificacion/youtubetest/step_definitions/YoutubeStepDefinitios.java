package co.com.bancolombia.certificacion.youtubetest.step_definitions;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certificacion.youtubetest.tasks.OpenTheBrowser;
import co.com.bancolombia.certificacion.youtubetest.user_interface.YoutubeHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class YoutubeStepDefinitios {
	@Managed(driver="chrome")
	private WebDriver hisDriver;
	private Actor jhon = Actor.named("Jhon");
	private YoutubeHomePage youtubeHomePage;
	
	@Before
	public void setup() {
		jhon.can(BrowseTheWeb.with(hisDriver));	
	}
	
	@Given("^that jhon opens his browser at Youtube page$")
	public void thatTheUserOpensHisBrowserAt() {
		jhon.wasAbleTo(OpenTheBrowser.at(youtubeHomePage));
	   
	}

	@When("^he enter your artist (.*)$")
	public void heEnterYourArtist(String artist) throws Exception {
	   
	}

	@Then("^he would see your songs$")
	public void heWouldSeeYourSongs() throws Exception {
	   
	}


	
}
