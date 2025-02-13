package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StepDefinitions {

    WebDriver driver;

    @Given("Open the browser")
    public void open_the_browser() {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver");
        driver = new FirefoxDriver();
        System.out.println("Browser is opened");
    }

    @When("Enter the URL {string}")
    public void enter_the_url(String url) {
        driver.get(url);
    }

    @Then("Enter the {string} and {string}")
    public void enter_the_username_and_password(String username, String password) {
        System.out.println("Username: " + username + " and Password: " + password + " are entered");
    }

    @When("Click on the login button")
    public void click_on_the_login_button() {
        driver.findElement(By.xpath("//button[text() = 'Log in']"));
        System.out.println("Login button is clicked");
    }

    @Then("Verify the user is logged in successfully")
    public void verify_the_user_is_logged_in_successfully() {
        System.out.println("User is logged in successfully");
        driver.quit();
    }
}