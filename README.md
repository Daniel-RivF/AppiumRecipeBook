README

mvn clean test -Dcucumber.options="src/test/java/com/cucumber/automation/features/iOSTestApp.feature" -DproxySet=true -DproxyHost= -DproxyPort=
mvn allure:report
mvn allure:serve

