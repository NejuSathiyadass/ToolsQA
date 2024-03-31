package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsFrameWindowsPage {
    private static AlertsFrameWindowsPage alertsFrameWindowsPageInstance;

    private AlertsFrameWindowsPage() {
    }

    public static AlertsFrameWindowsPage getInstance() {
        if (alertsFrameWindowsPageInstance == null) {
            alertsFrameWindowsPageInstance = new AlertsFrameWindowsPage();
        }
        return alertsFrameWindowsPageInstance;
    }

    @FindBy(xpath = "//*[text()=\"Browser Windows\"]")
    private static WebElement browserWindowLink;

    @FindBy(id = "tabButton")
    private static WebElement newTabButton;

    @FindBy(id = "sampleHeading")
    private static WebElement newTabText;

    public static WebElement getBrowserWindowLink() {
        return browserWindowLink;
    }

    public static WebElement getNewTabButton() {
        return newTabButton;
    }

    public static WebElement getNewTabText() {
        return newTabText;
    }

}
