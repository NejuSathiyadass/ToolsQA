package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InteractionsPage {
    private static InteractionsPage interactionsPageInstance;

    private InteractionsPage() {
    }

    public static InteractionsPage getInstance() {
        if (interactionsPageInstance == null) {
            interactionsPageInstance = new InteractionsPage();
        }
        return interactionsPageInstance;
    }

    @FindBy(xpath = "//*[text()=\"Droppable\"]")
    private static WebElement droppableLink;

    @FindBy(id = "draggable")
    private static WebElement dragMe;

    @FindBy(id = "droppable")
    private static WebElement dropMe;

    @FindBy(xpath = "//*[text()=\"Dropped!\"]")
    private static WebElement droppedMessage;

    public static WebElement getDroppableLink() {
        return droppableLink;
    }

    public static WebElement getDragMe() {
        return dragMe;
    }

    public static WebElement getDropMe() {
        return dropMe;
    }

    public static WebElement getDroppedMessage() {
        return droppedMessage;
    }


}
