Feature: Android Test App
  I want to test Android Apps

  Scenario: Get to PDP
    When user enters "ADMIN001" in element with id "com.carrefour.tablet.local.debug:id/login"
    When user enters "ADMIN001" in element with id "com.carrefour.tablet.local.debug:id/password"
    Then element with classname "android.widget.TextView" and index "0" validates with text "Datos de acceso"
    When user clicks on button with id "com.carrefour.tablet.local.debug:id/submit"
    Then element with id "com.carrefour.tablet.local.debug:id/login_id" validates with regex "^aADMIN001$"
    When user clicks on button with id "com.carrefour.tablet.local.debug:id/tab_categories"
    When user clicks on element with xpath "//android.widget.TextView[contains(@resource-id,'id/name') and @text='Informática']"
    When user clicks on element with xpath "//android.widget.TextView[contains(@resource-id,'id/name') and @text='Portátiles']"
    When user taps back button on device
    When user clicks on element with xpath "(//android.widget.Button[contains(@resource-id,'id/add_cart_button') and @text='Añadir'])[2]"
    When wait for "5" seconds
    When user clicks on element with xpath "(//android.widget.TextView[contains(@resource-id,'id/description')])[1]"
    When wait for "5" seconds








