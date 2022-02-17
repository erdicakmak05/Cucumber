package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AutomationPracticePage;
import utilities.ConfigReader;

public class AutomaitonPracticeStepdefinition {
    AutomationPracticePage automationPracticePage = new AutomationPracticePage();
    @Given("user sign in linkine tiklar")
    public void user_sign_in_linkine_tiklar() {
       automationPracticePage.signInElement.click();
    }
    @Given("email kutusuna @isareti olmayan email adresi yazar ve enter'a tiklar")
    public void email_kutusuna_isareti_olmayan_email_adresi_yazar_ve_enter_a_tiklar() {
        String invalidMail = ConfigReader.getProperty("AutomationPracticeInvalidMail");
        automationPracticePage.emailTextBox.sendKeys(invalidMail+ Keys.ENTER);
    }
    @Then("error mesajinin “Invalid email address”  oldugunu dogrulayin")
    public void error_mesajinin_invalid_email_address_oldugunu_dogrulayin() {
        Assert.assertTrue(automationPracticePage.invalidMailMessage.getText().contains("Invalid email address"));
    }

}
