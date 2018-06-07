package co.com.bancolombia.certificacion.youtubetest.user_interface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.youtube.com/")
public class YoutubeHomePage extends PageObject {
	public static final Target YOUTUBE_LOGO = Target.the("Youtube Logo").located(By.id("logo-icon-container"));

}
