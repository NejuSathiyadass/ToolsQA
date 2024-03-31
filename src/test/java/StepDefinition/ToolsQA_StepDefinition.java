package StepDefinition;

import Utilities.ConstantsUtils;
import Utilities.PageObjectGenerator;
import Utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;


public class ToolsQA_StepDefinition {

    private static final Logger LOGGER = LogManager.getLogger(ToolsQA_StepDefinition.class);

    @When("I navigate to the home page")
    public void user_navigates_to_home_page() {
        ReusableMethods.getDriver().get(ConstantsUtils.APP_URL);
    }

    @When("I click on element ([^\\s]+)$")
    public void clickOn(String element) {
        WebElement ele = PageObjectGenerator.convertToWebElement(element);
        ReusableMethods.clickOnElement(ele);
    }

    @When("I scroll to element ([^\\s]+)$")
    public void scrollTo(String element) {
        WebElement ele = PageObjectGenerator.convertToWebElement(element);
        ReusableMethods.scrollToElement(ele);
    }

    @Then("I verify the page title is displayed as {string}")
    public void verifyThePageTitle(String text) {
        String url = ReusableMethods.getDriver().getCurrentUrl();
        if (url.contains(text)) {
            LOGGER.info("Page title is displayed!!");
        }
    }

    @Then("^I enter text \"(.*?)\" into input field (.+)$")
    public void enterTextIntoTextBox(String text, String element) {
        WebElement ele = PageObjectGenerator.convertToWebElement(element);
        ReusableMethods.enterText(ele, text);
    }

    @Then("^element (.+) should have partial text as \"(.*?)\"$")
    public void verifyPartialText(String element, String text) {
        WebElement ele = PageObjectGenerator.convertToWebElement(element);
        ReusableMethods.verifyPartialText(ele, text);
    }

    @And("I double click on element ([^\\s]+)$")
    public void iDoubleClickOnElementElementsPage(String element) {
        WebElement ele = PageObjectGenerator.convertToWebElement(element);
        ReusableMethods.doubleClickElement(ele);
    }

    @And("I right click on element ([^\\s]+)$")
    public void iRightClickOnElementElementsPage(String element) {
        WebElement ele = PageObjectGenerator.convertToWebElement(element);
        ReusableMethods.rightClickElement(ele);
    }

    @And("I switch to new tab")
    public void iSwitchToNewTab() {
        ReusableMethods.switchToNewTab();
    }

    @And("I hover on element ([^\\s]+)$")
    public void iHoverOnElementWidgetsPage(String element) {
        WebElement ele = PageObjectGenerator.convertToWebElement(element);
        ReusableMethods.hoverOverElement(ele);
    }

    @And("^I select \"(.*?)\" by text from the drop down ([^\\s]+)$")
    public void iSelectByTextFromTheDropDownWidgetsPage(String text, String element) {
        WebElement ele = PageObjectGenerator.convertToWebElement(element);
        ReusableMethods.selectDropDown(ele, "text", text);
    }

    @And("I click on element ([^\\s]+) and hold it, then drop the element in ([^\\s]+)$")
    public void iClickOnElementInteractionsPageAndHoldItThenDropTheElementInInteractionsPage(String element1, String element2) {
        WebElement ele = PageObjectGenerator.convertToWebElement(element1);
        WebElement ele1 = PageObjectGenerator.convertToWebElement(element2);
        ReusableMethods.clickHoldAndDrop(ele, ele1);
    }

    @And("I drag the element from ([^\\s]+) and drop the element in ([^\\s]+)$")
    public void iDragTheElementFromInteractionsPageAndDropTheElementInInteractionsPage(String element1, String element2) {
        WebElement ele = PageObjectGenerator.convertToWebElement(element1);
        WebElement ele1 = PageObjectGenerator.convertToWebElement(element2);
        ReusableMethods.dragAndDrop(ele, ele1);
    }


}
