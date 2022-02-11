package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HMCPage;
import utilities.ConfigReader;

public class HmcStepDefinitions {
    HMCPage hmcPage = new HMCPage();

    @Given("kullanıcı login linkine tiklar")
    public void kullanıcı_login_linkine_tiklar() {
        hmcPage.mainPageLogin.click();
    }
    @Then("kullanıcı adi olarak {string} girer")
    public void kullanıcı_adi_olarak_girer(String kullaniciTipi) {
        hmcPage.userNameTextBox.sendKeys(ConfigReader.getProperty(kullaniciTipi));
    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String passwordTuru) {
        hmcPage.passwordTextBox.sendKeys(ConfigReader.getProperty(passwordTuru));
    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
        hmcPage.loginButonu.click();
    }
    @Then("basarili olarak giris yapildigini test eder")
    public void basarili_olarak_giris_yapildigini_test_eder() {
        Assert.assertTrue(hmcPage.basariliGirisYaziElementi.isDisplayed());
    }

    @And("giris yapilamadigini test eder")
    public void girisYapilamadiginiTestEder() {
        Assert.assertTrue(hmcPage.girisYapilamadiYaziElementi.isDisplayed());
    }

    @Then("scenario outline'dan username olarak {string} yazar")
    public void scenarioOutlineDanUsernameOlarakYazar(String username) {
        hmcPage.userNameTextBox.sendKeys(username);
    }

    @And("scenario outline'dan password olarak {string} yazar")
    public void scenarioOutlineDanPasswordOlarakYazar(String password) {
        hmcPage.passwordTextBox.sendKeys(password);
    }


}
