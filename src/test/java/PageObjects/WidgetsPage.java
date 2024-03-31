package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WidgetsPage {
    private static WidgetsPage widgetsPageInstance;

    private WidgetsPage() {
    }

    public static WidgetsPage getInstance() {
        if (widgetsPageInstance == null) {
            widgetsPageInstance = new WidgetsPage();
        }
        return widgetsPageInstance;
    }


    @FindBy(xpath = "//*[text()=\"Menu\"]")
    private static WebElement menuLink;

    @FindBy(xpath = "//*[text()=\"Select Menu\"]")
    private static WebElement selectMenuLink;

    @FindBy(xpath = "//*[text()=\"Main Item 2\"]")
    private static WebElement menuItemHover;

    @FindBy(xpath = "//*[text()=\"SUB SUB LIST »\"]")
    private static WebElement subSubListHover;

    @FindBy(xpath = "//*[text()=\"Sub Sub Item 2\"]")
    private static WebElement subSubItemText;

    @FindBy(id = "oldSelectMenu")
    private static WebElement oldSelectMenuDropDown;

    public static WebElement getMenuLink() {
        return menuLink;
    }

    public static WebElement getSelectMenuLink() {
        return selectMenuLink;
    }

    public static WebElement getMenuItemHover() {
        return menuItemHover;
    }

    public static WebElement getSubSubListHover() {
        return subSubListHover;
    }

    public static WebElement getSubSubItemText() {
        return subSubItemText;
    }

    public static WebElement getOldSelectMenuDropDown() {
        return oldSelectMenuDropDown;
    }


}
