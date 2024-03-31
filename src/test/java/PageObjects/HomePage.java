package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    private static HomePage homePageInstance;

    private HomePage() {
    }

    public static HomePage getInstance() {
        if (homePageInstance == null) {
            homePageInstance = new HomePage();
        }
        return homePageInstance;
    }

    @FindBy(xpath = "//*[text()=\"Elements\"]")
    private static WebElement elementsLink;

    @FindBy(xpath = "//*[text()=\"Forms\"]")
    private static WebElement formsLink;

    @FindBy(xpath = "//*[text()=\"Alerts, Frame & Windows\"]")
    private static WebElement alertsFrameWindowsLink;

    @FindBy(xpath = "//*[text()=\"Widgets\"]")
    private static WebElement widgetsLink;

    @FindBy(xpath = "//*[text()=\"Interactions\"]")
    private static WebElement interactionsLink;

    @FindBy(xpath = "//*[text()=\"Book Store Application\"]")
    private static WebElement bookStoreApplicationLink;


    public static WebElement getElementsLink() {
        return elementsLink;
    }

    public static WebElement getFormsLink() {
        return formsLink;
    }

    public static WebElement getAlertsFrameWindowsLink() {
        return alertsFrameWindowsLink;
    }

    public static WebElement getWidgetsLink() {
        return widgetsLink;
    }

    public static WebElement getInteractionsLink() {
        return interactionsLink;
    }

    public static WebElement getBookStoreApplicationLink() {
        return bookStoreApplicationLink;
    }


}
