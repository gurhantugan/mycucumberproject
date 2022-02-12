package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginStepDefs {
    LoginPage loginPage=new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_login_url"));
Thread.sleep(3000);
    }
    @Given("user clicks on login dropdown")
    public void user_clicks_on_login_dropdown() throws InterruptedException {
        loginPage.loginDropdown.click();
        Thread.sleep(3000);

    }
    @Given("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() throws InterruptedException {
        loginPage.signInButton.click();
        Thread.sleep(3000);

    }
    @Given("user sends username {string}")
    public void user_sends_username(String string) throws InterruptedException {
        loginPage.username.sendKeys(string);
        Thread.sleep(3000);
    }
    @Given("user sends password {string}")
    public void user_sends_password(String string) throws InterruptedException {
        loginPage.password.sendKeys(string);
        Thread.sleep(3000);
    }
    @Given("user clicks on the login button")
    public void user_clicks_on_the_login_button() throws InterruptedException {
        loginPage.loginButton.click();
        Thread.sleep(3000);

    }

}