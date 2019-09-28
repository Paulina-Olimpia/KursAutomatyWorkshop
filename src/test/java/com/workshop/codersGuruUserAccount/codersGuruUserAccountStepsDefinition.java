package com.workshop.codersGuruUserAccount;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;


public class codersGuruUserAccountStepsDefinition { ;

    WebDriver driver;

    @Given("an open browser with website (.*)")
    public void anOpenBrowserWithHttpsMenMenSCodersguruPl(String websiteAddress) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get(websiteAddress);
    }

    @When("^user enters chosen email address (.*)$")
    public void userInputsChosenEmailAddress(String emailAddress) {
        WebElement email = driver.findElement(By.name("email"));
        email.clear();
        email.sendKeys(emailAddress);
    }

    @And("^user clicks Register button$")
    public void userClicksRegisterButton() {

        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }


    @And("^user enters name (.*)$")
    public void userEntersName(String name) {
        WebElement userName = driver.findElement(By.id("fos_user_registration_form_name"));
        userName.sendKeys(name);
    }


    @And("^user enters surname (.*)$")
    public void userEntersSurname(String surname) {
        WebElement userLastname = driver.findElement(By.id("fos_user_registration_form_lastname"));
        userLastname.sendKeys(surname);
    }

    @And("^user enters first password (.*)$")
    public void userEntersFirstPassword(String firstPassword) {
        WebElement userPassword = driver.findElement(By.id("fos_user_registration_form_plainPassword_first"));
        userPassword.sendKeys(firstPassword);
    }

    @And("^user enters second password (.*)$")
    public void userEntersSecondPassword(String secondPassword) {
        WebElement userSecondPassword = driver.findElement(By.id("fos_user_registration_form_plainPassword_second"));
        userSecondPassword.sendKeys(secondPassword);
    }


    @And("^user enters city (.*)$")
    public void userEntersCity(String city) {
        WebElement userCity = driver.findElement(By.id("form_city"));
        userCity.sendKeys(city);

    }

    @And("^user enters postcode (.*)$")
    public void userEntersPostcode(String postcode) {
        WebElement userPostcode = driver.findElement(By.id("form_postal_code"));
        userPostcode.sendKeys(postcode);

    }

    @And("^user enters street (.*)$")
    public void userEntersStreet(String street) {
        WebElement userStreet = driver.findElement(By.id("form_street"));
        userStreet.sendKeys(street);

    }

    @And("^user enters home number (.*)$")
    public void userEntersHomeNumber(String number) {
        WebElement userHomeNumber = driver.findElement(By.id("form_number"));
        userHomeNumber.sendKeys(number);

    }


    @And("^user accepts the terms and conditions$")
    public void userAcceptsTheTermsAndConditions() {
        WebElement terms = driver.findElement(By.xpath("//input[@type='checkbox']"));
        terms.click();
    }


    @And("^user clicks the register button$")
    public void userClicksTheRegisterButton() {
        WebElement RegisterButton = driver.findElement(By.id("register-submit-btn"));
        RegisterButton.click();

    }

    @Then("^the name (.*) is visible and user is registered$")
    public void theNameVisibleNameIsVisibleAndUserIsRegistered(String visibleName) {
        WebElement confirmation = driver.findElement(By.id("user-name"));
        assertEquals( visibleName, confirmation.getText());
    }



    //  driver.quit();
    }








