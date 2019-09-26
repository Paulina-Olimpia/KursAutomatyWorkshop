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


public class codersGuruUserAccountStepsDefinition {

    WebDriver driver;

    @Given("an open browser with website https://men-men-s-01.codersguru.pl")
    public void anOpenBrowserWithHttpsMenMenSCodersguruPl() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://men-men-s-01.codersguru.pl");
    }

    @When("^user enters chosen email address galona@itfast.net$")
    public void userInputsChosenEmailAddress() {
        WebElement email = driver.findElement(By.name("email"));
        email.clear();
        email.sendKeys("galona@itfast.net");
    }

    @And("^user clicks Register button$")
    public void userClicksRegisterButton() {

        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    //waity!

    @And("^user enters name Jan$")
    public void userEntersName() {
        WebElement userName = driver.findElement(By.id("fos_user_registration_form_name"));
        userName.sendKeys("Jan");
    }


    @And("^user enters surname Kowalski$")
    public void userEntersSurname() {
        WebElement userSurname = driver.findElement(By.id("fos_user_registration_form_lastname"));
        userSurname.sendKeys("Kowalski");
    }

    @And("^user enters first password Haslo123$")
    public void userEntersFirstPassword() {
        WebElement userPassword = driver.findElement(By.id("fos_user_registration_form_plainPassword_first"));
        userPassword.sendKeys("Haslo123");
    }

    @And("^user enters second password Haslo123$")
    public void userEntersSecondPassword() {
        WebElement userPassword = driver.findElement(By.id("fos_user_registration_form_plainPassword_second"));
        userPassword.sendKeys("Haslo123");
    }


    @And("^user enters city Bytom$")
    public void userEntersCity() {
        WebElement userCity = driver.findElement(By.id("form_city"));
        userCity.sendKeys("Bytom");

    }

    @And("^user enters postcode 41-411$")
    public void userEntersPostcode() {
        WebElement userPostcode = driver.findElement(By.id("form_postal_code"));
        userPostcode.sendKeys("41-411");

    }

    @And("^user enters street Bytomska$")
    public void userEntersStreet() {
        WebElement userStreet = driver.findElement(By.id("form_street"));
        userStreet.sendKeys("Bytomska");

    }

    @And("^user enters home number 22$")
    public void userEntersHomeNumber() {
        WebElement userHomeNumber = driver.findElement(By.id("form_number"));
        userHomeNumber.sendKeys("22");

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

    @Then("^user is registered$")
    public void userIsRegistered() {

        WebElement confirmation = driver.findElement(By.id("user-name"));
        assertEquals("Jan", confirmation.getText());

    }


    //  driver.quit();
    }








