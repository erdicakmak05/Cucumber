package stepdefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HerokuappAddElementPages;
import utilities.ReusableMethods;

public class HerokuappAddElementDefinitions {
    HerokuappAddElementPages herokuappAddElementPages = new HerokuappAddElementPages();
    @When("kullanici Add Element butona basar")
    public void kullanici_add_element_butona_basar() {
        herokuappAddElementPages.addElementButtonn.click();
    }
    @When("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() {
        ReusableMethods.waitForVisibility(herokuappAddElementPages.firstDeleteButton,15);
    }
    @When("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuappAddElementPages.firstDeleteButton.isDisplayed());
    }
    @When("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
        herokuappAddElementPages.firstDeleteButton.click();
    }

}
