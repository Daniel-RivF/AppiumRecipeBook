Feature: Android Test App
  I want to test Android Apps

  Scenario: UI navigation test1
    When user enters "ADMIN001" in element with locator "com.carrefour.tablet.local.debug:id/login"
    When user enters "ADMIN001" in element with locator "com.carrefour.tablet.local.debug:id/password"

    Then element with name "android.widget.TextView" should be present


