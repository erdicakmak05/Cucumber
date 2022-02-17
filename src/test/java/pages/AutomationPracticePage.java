package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPracticePage {
    public AutomationPracticePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    public WebElement signInElement;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//li[normalize-space()='Invalid email address.']")
    public WebElement invalidMailMessage;
}
