package pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;

public class SerbestCalisma {

    @Test
    public void Test1() throws InterruptedException {
        Driver.getDriver().get("https://amazon.com");

        WebElement aramaKutusu=Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Iphone"+Keys.ENTER);

    }
}
