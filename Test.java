package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginClass {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ignitiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();
        //baseURL fetches the URL required to
        // this will fetch the expected result by the assert command

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        //this can act as a reporting functions
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {

            System.out.println("Test Failed");
        }

        //close Fire fox
        driver.close();
        //this will close the browser window
    }

}
