package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebUniverstyPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class WebUniverstyStepDefinition {
    WebUniverstyPage webUniverstyPage = new WebUniverstyPage();

    @Given("Login Portal'a  kadar asagi iner")
    public void login_portal_a_kadar_asagi_iner() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

    }
    @Given("Login Portal'a tiklar")
    public void login_portal_a_tiklar() {
        /*JavascriptExecutor executor = (JavascriptExecutor)Driver.getDriver();
        executor.executeScript("arguments[0].click();", webUniverstyPage.webUniversityLoginMainButton);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(webUniverstyPage.webUniversityLoginMainButton).perform();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        webUniverstyPage.webUniversityLoginMainButton.click();

    }
    @Then("acilan diger window'a gecer")
    public void acilan_diger_window_a_gecer() {
        ReusableMethods.switchToWindow("WebDriver | Login Portal");
    }
    @Then("{string} ve  {string} kutularina deger yazar")
    public void ve_kutularina_deger_yazar(String username, String password) {
        webUniverstyPage.webUniversityUserNameTextbox.sendKeys(username);
        webUniverstyPage.webUniversityPasswordTextbox.sendKeys(password);
    }
    @Then("login butonuna basin")
    public void login_butonuna_basin() {
        webUniverstyPage.WebUniversityLoginButton.click();
    }
    @Then("popup'ta cikan yazinin validation failed oldugunu test eder")
    public void popup_ta_cikan_yazinin_validation_failed_oldugunu_test_eder() {
        System.out.println(Driver.getDriver().switchTo().alert().getText());
       String actualPopupMessage =  Driver.getDriver().switchTo().alert().getText();
       String expectedPopupMessage = "validation failed";
        System.out.println(actualPopupMessage);
        Assert.assertTrue(actualPopupMessage.equals(expectedPopupMessage));
    }
    @Then("ok diyerek popup'i kapatir")
    public void ok_diyerek_popup_i_kapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }
    @Then("ilk sayfaya geri doner")
    public void ilk_sayfaya_geri_doner() {
        ReusableMethods.switchToWindow("WebDriverUniversity.com");
    }
    @Then("ilk sayfaya donuldugunu test eder")
    public void ilk_sayfaya_donuldugunu_test_eder() {
        Assert.assertTrue(Driver.getDriver().getTitle().equals("WebDriverUniversity.com"));
    }

}
