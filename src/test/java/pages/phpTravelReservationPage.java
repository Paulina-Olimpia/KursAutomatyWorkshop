package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class phpTravelReservationPage {

    WebDriver driver;

    @FindBy
    WebElement flights;
    @FindBy
    WebElement departure;
    @FindBy
    WebElement destination;
    @FindBy
    WebElement departureDate;
    @FindBy
    WebElement passegers;
    @FindBy
    WebElement searchButton;

    WebElement bookNow;

    WebElement guestBooking;

    WebElement title;

    WebElement name;

    WebElement surname;

    WebElement email;

    WebElement phone;

    WebElement birthday;

    WebElement idcardNumber;

    WebElement expirationDate;

    WebElement nationality;

    WebElement cardType;

    WebElement creditCardNumber;

    WebElement ccexpirationMonth;

    WebElement ccexpirationYear;

    WebElement creditCardCVV;


}
