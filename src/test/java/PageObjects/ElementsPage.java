package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage {
    private static ElementsPage elementsPageInstance;

    private ElementsPage() {
    }

    public static ElementsPage getInstance() {
        if (elementsPageInstance == null) {
            elementsPageInstance = new ElementsPage();
        }
        return elementsPageInstance;
    }

    @FindBy(xpath = "//*[text()=\"Text Box\"]")
    private static WebElement textBoxLink;

    @FindBy(xpath = "//*[text()=\"Buttons\"]")
    private static WebElement buttonsLink;

    @FindBy(id = "userName")
    private static WebElement fullNameTextBox;

    @FindBy(id = "userEmail")
    private static WebElement emailTextBox;

    @FindBy(id = "currentAddress")
    private static WebElement currentAddressTextBox;

    @FindBy(id = "permanentAddress")
    private static WebElement permanentAddressTextBox;

    @FindBy(id = "submit")
    private static WebElement submitButton;

    @FindBy(id = "name")
    private static WebElement nameText;

    @FindBy(id = "email")
    private static WebElement emailText;

    @FindBy(xpath = "//p[@id=\"currentAddress\"]")
    private static WebElement currentAddressText;

    @FindBy(xpath = "//p[@id=\"permanentAddress\"]")
    private static WebElement permanentAddressText;

    @FindBy(id = "doubleClickBtn")
    private static WebElement doubleClick;

    @FindBy(id = "doubleClickMessage")
    private static WebElement doubleClickMessage;

    @FindBy(id = "rightClickBtn")
    private static WebElement rightClick;

    @FindBy(id = "rightClickMessage")
    private static WebElement rightClickMessage;

    public static WebElement getTextBoxLink() {
        return textBoxLink;
    }

    public static WebElement getButtonsLink() {
        return buttonsLink;
    }

    public static WebElement getFullNameTextBox() {
        return fullNameTextBox;
    }

    public static WebElement getEmailTextBox() {
        return emailTextBox;
    }

    public static WebElement getCurrentAddressTextBox() {
        return currentAddressTextBox;
    }

    public static WebElement getPermanentAddressTextBox() {
        return permanentAddressTextBox;
    }

    public static WebElement getSubmitButton() {
        return submitButton;
    }

    public static WebElement getNameText() {
        return nameText;
    }

    public static WebElement getEmailText() {
        return emailText;
    }

    public static WebElement getCurrentAddressText() {
        return currentAddressText;
    }

    public static WebElement getPermanentAddressText() {
        return permanentAddressText;
    }

    public static WebElement getDoubleClick() {
        return doubleClick;
    }

    public static WebElement getDoubleClickMessage() {
        return doubleClickMessage;
    }

    public static WebElement getRightClick() {
        return rightClick;
    }

    public static WebElement getRightClickMessage() {
        return rightClickMessage;
    }


}
