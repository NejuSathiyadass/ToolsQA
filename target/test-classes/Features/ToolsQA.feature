Feature: Tools QA application

  @ToolsQA_TC01 @ToolsQA
  Scenario: Validate whether the element page is displayed
    When I navigate to the home page
    Then I scroll to element HomePage.elementsLink
    And I click on element HomePage.elementsLink
    And I verify the page title is displayed as "elements"


  @ToolsQA_TC02 @ToolsQA
  Scenario: Validate whether the forms page is displayed
    When I navigate to the home page
    Then I scroll to element HomePage.formsLink
    And I click on element HomePage.formsLink
    And I verify the page title is displayed as "forms"


  @ToolsQA_TC03 @ToolsQA
  Scenario: Validate whether the alerts, frame & windows page is displayed
    When I navigate to the home page
    Then I scroll to element HomePage.alertsFrameWindowsLink
    And I click on element HomePage.alertsFrameWindowsLink
    And I verify the page title is displayed as "alertsWindows"


  @ToolsQA_TC04 @ToolsQA
  Scenario: Validate whether the widgets page is displayed
    When I navigate to the home page
    Then I scroll to element HomePage.widgetsLink
    And I click on element HomePage.widgetsLink
    And I verify the page title is displayed as "widgets"


  @ToolsQA_TC05 @ToolsQA
  Scenario: Validate whether the interactions page is displayed
    When I navigate to the home page
    Then I scroll to element HomePage.interactionsLink
    And I click on element HomePage.interactionsLink
    And I verify the page title is displayed as "interaction"


  @ToolsQA_TC06 @ToolsQA
  Scenario: Validate whether the book store application page is displayed
    When I navigate to the home page
    Then I scroll to element HomePage.bookStoreApplicationLink
    And I click on element HomePage.bookStoreApplicationLink
    And I verify the page title is displayed as "books"


  @ToolsQA_TC07 @ToolsQA
  Scenario Outline: Validate the text box features
    When I navigate to the home page
    Then I scroll to element HomePage.elementsLink
    And I click on element HomePage.elementsLink
    And I click on element ElementsPage.textBoxLink
    And I enter text "<Name>" into input field ElementsPage.fullNameTextBox
    And I enter text "<Email>" into input field ElementsPage.emailTextBox
    And I enter text "<Current Address>" into input field ElementsPage.currentAddressTextBox
    And I enter text "<Permanent Address>" into input field ElementsPage.permanentAddressTextBox
    And I scroll to element ElementsPage.submitButton
    And I click on element ElementsPage.submitButton
    And element ElementsPage.nameText should have partial text as "Arthur"
    And element ElementsPage.emailText should have partial text as "arthurSGodfrey@gmail.com"
    And element ElementsPage.currentAddressText should have partial text as "1000 South Ave"
    And element ElementsPage.permanentAddressText should have partial text as "1000 South Ave, Rochester, North Dakota-14620"

    Examples:
      | Name              | Email                    | Current Address                               | Permanent Address                             |
      | Arthur S. Godfrey | arthurSGodfrey@gmail.com | 1000 South Ave, Rochester, North Dakota-14620 | 1000 South Ave, Rochester, North Dakota-14620 |


  @ToolsQA_TC08 @ToolsQA
  Scenario: Validate whether user can able to do double click
    When I navigate to the home page
    Then I scroll to element HomePage.elementsLink
    And I click on element HomePage.elementsLink
    And I click on element ElementsPage.buttonsLink
    And I double click on element ElementsPage.doubleClick
    And element ElementsPage.doubleClickMessage should have partial text as "You have done a double click"


  @ToolsQA_TC09 @ToolsQA
  Scenario: Validate whether user can able to do right click
    When I navigate to the home page
    Then I scroll to element HomePage.elementsLink
    And I click on element HomePage.elementsLink
    And I click on element ElementsPage.buttonsLink
    And I right click on element ElementsPage.rightClick
    And element ElementsPage.rightClickMessage should have partial text as "You have done a right click"


  @ToolsQA_TC10 @ToolsQA
  Scenario: Validate whether user can able to verify the text present in new tab
    When I navigate to the home page
    Then I scroll to element HomePage.alertsFrameWindowsLink
    And I click on element HomePage.alertsFrameWindowsLink
    And I click on element AlertsFrameWindowsPage.browserWindowLink
    And I click on element AlertsFrameWindowsPage.newTabButton
    And I switch to new tab
    And element AlertsFrameWindowsPage.newTabText should have partial text as "This is a sample page"


  @ToolsQA_TC11 @ToolsQA
  Scenario: Validate whether user can able to hover on element and verify the text
    When I navigate to the home page
    Then I scroll to element HomePage.widgetsLink
    And I click on element HomePage.widgetsLink
    And I click on element WidgetsPage.menuLink
    And I hover on element WidgetsPage.menuItemHover
    And I hover on element WidgetsPage.subSubListHover
    And element WidgetsPage.subSubItemText should have partial text as "Sub Sub Item 2"


  @ToolsQA_TC12 @ToolsQA
  Scenario: Validate whether user can able to select value from dropdown
    When I navigate to the home page
    Then I scroll to element HomePage.widgetsLink
    And I click on element HomePage.widgetsLink
    And I click on element WidgetsPage.selectMenuLink
    And I scroll to element WidgetsPage.oldSelectMenuDropDown
    And I select "Black" by text from the drop down WidgetsPage.oldSelectMenuDropDown


  @ToolsQA_TC13 @ToolsQA
  Scenario: Validate whether user can able to perform drag & drop (without using drag and drop)
    When I navigate to the home page
    Then I scroll to element HomePage.interactionsLink
    And I click on element HomePage.interactionsLink
    And I click on element InteractionsPage.droppableLink
    And I click on element InteractionsPage.dragMe and hold it, then drop the element in InteractionsPage.dropMe
    And element InteractionsPage.droppedMessage should have partial text as "Dropped!"


  @ToolsQA_TC14 @ToolsQA
  Scenario: Validate whether user can able to perform drag & drop
    When I navigate to the home page
    Then I scroll to element HomePage.interactionsLink
    And I click on element HomePage.interactionsLink
    And I click on element InteractionsPage.droppableLink
    And I scroll to element InteractionsPage.dragMe
    And I drag the element from InteractionsPage.dragMe and drop the element in InteractionsPage.dropMe
    And element InteractionsPage.droppedMessage should have partial text as "Dropped!"