package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebUniverstyPage {

    public WebUniverstyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@id=\"login-portal\"]")
    public WebElement webUniversityLoginMainButton;

    @FindBy(xpath = "//input[@id='text']")
    public WebElement webUniversityUserNameTextbox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement webUniversityPasswordTextbox;

    @FindBy(xpath = "//button[@id='login-button']")
    public WebElement WebUniversityLoginButton;
}
