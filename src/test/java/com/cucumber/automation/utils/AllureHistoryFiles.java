package com.cucumber.automation.utils;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class AllureHistoryFiles {
    public static void copyHistoryFolder() {

        File source = new File("/home/drf/android_tests/AppiumRecipeBook/target/site/allure-maven-plugin/history");
        File dest = new File("/home/drf/android_tests/AppiumRecipeBook/target/allure-results");

        if (source.exists()) {
            try {
                FileUtils.copyDirectory(source, dest);
                System.out.println("ALLURE COPY DONE...");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("NO COPY");
        }
    }
}