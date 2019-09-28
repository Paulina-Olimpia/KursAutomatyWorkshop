package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class codersGuruLoginPage {

        WebDriver driver;

        @FindBy(id = "fos_user_registration_form_email")
        WebElement email;
        @FindBy(id = "fos_user_registration_form_name")
        WebElement userName;
        @FindBy(id = "fos_user_registration_form_lastname")
        WebElement userLastname;
        @FindBy(id = "fos_user_registration_form_plainPassword_first")
        WebElement userPassword;
        @FindBy(id = "fos_user_registration_form_plainPassword_second")
        WebElement userSecondPassword;
        @FindBy(id = "form_city")
        WebElement userCity;
        @FindBy(id = "form_postal_code")
        WebElement userPostcode;
        @FindBy(id = "form_street" )
        WebElement userStreet;
        @FindBy(id = "form_number")
        WebElement userHomeNumber;



        public void codersGuruLoginPage (WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public void RegisterNewUser (String email, String name, String lastName, String password, String secondPassword,
       String city, String postcode, String street, String number) {
            this.email.sendKeys(email);
            this.userName.sendKeys(name);
            this.userLastname.sendKeys(lastName);
            this.userPassword.sendKeys(password);
            this.userSecondPassword.sendKeys(secondPassword);
            this.userCity.sendKeys(city);
            this.userPostcode.sendKeys(postcode);
            this.userStreet.sendKeys(street);
            this.userHomeNumber.sendKeys(number);
        }
}
