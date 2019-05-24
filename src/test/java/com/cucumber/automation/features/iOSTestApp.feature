Feature: Android Test App
  I want to test Android Apps

  Scenario: UI navigation test1
    When user enters "ADMIN001" in element with id "com.carrefour.tablet.local.debug:id/login"
    When user enters "ADMIN001" in element with id "com.carrefour.tablet.local.debug:id/password"
    Then element with classname "android.widget.TextView" and index "0" validates with text "Datos de acceso"
    When user clicks on button with locator "com.carrefour.tablet.local.debug:id/submit"

    When user clicks on button with locator "com.carrefour.tablet.local.debug:id/tab_categories"

    When user clicks on element with xpath "//android.widget.TextView[contains(@resource-id,'id/name') and @text='Informática']"
    When user clicks on element with xpath "//android.widget.TextView[contains(@resource-id,'id/name') and @text='Portátiles']"
    And wait for "5" seconds


