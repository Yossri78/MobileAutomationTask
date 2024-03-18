package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PrivacyPage;
import pages.WeatherHomePage;

public class WeatherHomeSteps {

    WeatherHomePage weatherHomeObj = new WeatherHomePage();
    PrivacyPage privacyPage = new PrivacyPage();

    @Given("user is on weather app home page")
    public void user_is_on_weather_app_home_page() {
        weatherHomeObj.validateLocationIconExistence();
    }

    @When("user clicks on navigation menu")
    public void user_clicks_on_navigation_menu() {
        weatherHomeObj.clickNavigationSettingsIcon();
    }

    @When("user clicks on unit setting option")
    public void user_clicks_on_unit_setting_option() {
        weatherHomeObj.clickItemUnitSettings();
    }


    @When("user clicks on got it button")
    public void user_clicks_on_got_it_button() {
        privacyPage.clickGotItButton();
    }

    @Then("validate on displayed weather home page rain and waterdrop icons")
    public void validate_on_displayed_weather_home_page_rain_and_waterdrop_icons() {
        weatherHomeObj.validateRainIcon();
        weatherHomeObj.validateWaterDropIcon();
    }

}
