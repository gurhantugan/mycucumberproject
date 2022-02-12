package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.Driver;

public class GoogleStepDefs {
    GooglePage googlePage = new GooglePage();

    @Given("user is on the google page")
    public void user_is_on_the_google_page() {
//        OUR JAVA LOGIC GOES HERE
//        THIS IS SAME AS @Test in Junit or test ng
        Driver.getDriver().get("https://www.google.com");
    }

    @When("user search for iPhone on google")
    public void user_search_for_i_phone_on_google() {
        Driver.getDriver().findElement(By.id("L2AGLb")).click();
        googlePage.googleSearchBox.sendKeys("iPhone"+ Keys.ENTER);
    }

    @Then("verify the result has iPhone related results")
    public void verify_the_result_has_i_phone_related_results() {
        String title = Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("iPhone"));
    }

    @When("user search for Tea Pot on google")
    public void user_search_for_tea_pot_on_google() {
        try{Driver.getDriver().findElement(By.id("L2AGLb")).click();

        }catch (Exception e){
            System.out.println("skip this page");
        }

        googlePage.googleSearchBox.sendKeys("Tea Pot"+Keys.ENTER);
    }
    @Then("verify the result has Tea Pot related results")
    public void verify_the_result_has_tea_pot_related_results() {

        String title = Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("Tea Pot"));
    }

    @When("user search for flower on google")
    public void user_search_for_flower_on_google() {
        try{Driver.getDriver().findElement(By.id("L2AGLb")).click();

        }catch (Exception e){
            System.out.println("skip this page");
        }

        googlePage.googleSearchBox.sendKeys("flower"+Keys.ENTER);
    }
    @Then("verify the result has flower related results")
    public void verify_the_result_has_flower_related_results() {
        String title = Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("flower"));
        Assert.assertTrue(false);
    }

    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }

    @When("user search for {string}")
    public void user_search_for(String string) {
        try{Driver.getDriver().findElement(By.id("L2AGLb")).click();

        }catch (Exception e){

        }
        googlePage.googleSearchBox.sendKeys(string+Keys.ENTER);
    }

    @Then("verify the result has {string}")
    public void verify_the_result_has(String string) {
        String title = Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains(string));
    }

}
