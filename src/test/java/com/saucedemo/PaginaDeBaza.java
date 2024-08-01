package com.saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.openqa.selenium.chrome.ChromeOptions;


public class PaginaDeBaza
{
    WebDriver driver;

    @Parameters({"browserParam"})
    @BeforeMethod(alwaysRun = true)
    public void setUp(@Optional("chrome") String browser)
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--search-engine-choice-country");
        //open page
        String url = "https://www.saucedemo.com/";
        driver = new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
    }
    // !!!!!!!!!!!!!!!!Locatori !!!!!!!!!!!!!!!!!!!!
    // pagina de baza
    String locatorCampLoginUserByID="user-name";
    String locatorCampLoginPasswordByID="password";
    String locatorButonLoginByID="login-button";
    String locatorCampEroareByXpath="//div[@id='login_button_container']//form//h3";

    // pagina dupa logare
    String locatorButonMeniuStangaSusByXpath="/html//button[@id='react-burger-menu-btn']";
    String locatorButonAboutDinMeniuStangaSusByXpath="/html//a[@id='about_sidebar_link']";
    String locatorButonCartDreaptaSusByXpath="/html/body/div[1]/div/div/div[1]/div[1]/div[3]/a";

    //pagina meniu
    String locatorButonCookieInPaginaAboutByXpath="/html/body/div[9]/div[2]/div/div/div[2]/div/div/button[1]";
    String locatorButonLogoutByXpath="/html//a[@id='logout_sidebar_link']";
    String locatorButonRessetAppStateByXpat="/html//a[@id='reset_sidebar_link']";
    String locatorButonAllItemByXpath="/html//a[@id='inventory_sidebar_link']";
    String locatorInchidereMeniuXpath="//*[@id=\"react-burger-cross-btn\"]";


    //Pagina cart
    String locatorButonCheckoutByID="checkout";
    String locatorButonContinueShopingByname="continue-shopping";
    String locatorBadgeByXpath="/html/body/div/div/div/div[1]/div[1]/div[3]/a/span";

    //Pagina checkout step one

    String locatorButonContinueByID="continue";
    String locatorButonCancelById="cancel";

    //locatori butoane produse
    String locatorButonAddToChartProdus1ByID="add-to-cart-sauce-labs-backpack";
    String locatorButonAddToChartProdus2ByID="add-to-cart-sauce-labs-bike-light";
    String locatorButonAddToChartProdus3ByID="add-to-cart-sauce-labs-bolt-t-shirt";
    String locatorButonAddToChartProdus4ByID="add-to-cart-sauce-labs-fleece-jacket";
    String locatorButonAddToChartProdus5ByID="add-to-cart-sauce-labs-onesie";
    String locatorButonAddToChartProdus6ByID="add-to-cart-test.allthethings()-t-shirt-(red)";
    String locatorButonRemoveProdus1ByID="remove-sauce-labs-backpack";
    String locatorButonRemoveProdus2ByID ="remove-sauce-labs-bike-light";
    String locatorButonRemoveProdus3ByID="remove-sauce-labs-bolt-t-shirt";
    String locatorButonRemoveProdus4ByID="remove-sauce-labs-fleece-jacket";
    String locatorButonRemoveProdus5ByID="remove-sauce-labs-onesie";
    String locatorButonRemoveProdus6ByID="remove-test.allthethings()-t-shirt-(red)";

    // locatori imagini
    String locatorImagineProdus1ByXpath="//*[@id=\"item_4_img_link\"]/img";
    String locatorImagineProdus2ByXpath="//*[@id=\"item_0_img_link\"]/img";
    String locatorImagineProdus3ByXpath="//*[@id=\"item_1_img_link\"]/img";
    String locatorImagineProdus4ByXpath="//*[@id=\"item_5_img_link\"]/img";
    String locatorImagineProdus5ByXpath="//*[@id=\"item_2_img_link\"]/img";
    String locatorImagineProdus6ByXpath="//*[@id=\"item_3_img_link\"]/img";

    // !!!!!!!!!!!!!!variabile useri!!!!!!!!!!!!!!!!

    String user1="standard_user";
    String user2="locked_out_user";
    String user3="problem_user";
    String user4="performance_glitch_user";
    String user5="error_user";
    String user6="visual_user";
    // !!!!!!!!!!!!!variabile produse!!!!!!!!!!!!!!!

    String denumireProdus1="Sauce Labs Backpack";
    String denumireProdus2="Sauce Labs Bike Light";
    String denumireProdus3="Sauce Labs Bolt T-Shirt";
    String denumireProdus4="Sauce Labs Fleece Jacket";
    String denumireProdus5="Sauce Labs Onesie";
    String denumireProdus6="Test.allTheThings() T-Shirt (Red)";

    //!!!!!!!!!!!!!!!locatori denumire produs!!!!!!!!!

    String locatorDenumireProdus1Css="[data-test='item-4-title-link'] [data-test]";
    String locatorDenumirePRODUS2Css="[data-test='item-0-title-link'] [data-test]";
    String locatorDenumireProdus3Css="[data-test='item-1-title-link'] [data-test]";
    String locatorDenumireProdus4Css="[data-test='item-5-title-link'] [data-test]";
    String locatorDenumireProdus5Css="[data-test='item-2-title-link'] [data-test]";
    String locatorDenumireProdus6Css="[data-test='item-3-title-link'] [data-test]";

    //!!!!!!!!!!!!!!!locator descriere produs!!!!!!!!!!!!!!!!!!!

    String locatorDescriereProdus1ByXpath="//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[1]/div";
    String locatorDescriereProdus2ByXpath="//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[1]/div";
    String locatorDescriereProdus3ByXpath="//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[1]/div";
    String locatorDescriereProdus4ByXpath="//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[1]/div";
    String locatorDescriereProdus5ByXpath="//*[@id=\"inventory_container\"]/div/div[5]/div[2]/div[1]/div";
    String locatorDescriereProdus6ByXpath="//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[1]/div";


//
//    //!!!!!!!!!!!!!!!! locator produs!!!!!!!!!!!!!!
//    String locatorProdus1Xpath="//*[@id=\"inventory_container\"]/div/div[1]";
//    String locatorProdus2Xpath="//*[@id=\"inventory_container\"]/div/div[2]";
//    String locatorProdus3Xpath="//*[@id=\"inventory_container\"]/div/div[1]";
//    String locatorProdus4Xpath="//*[@id=\"inventory_container\"]/div/div[2]";
//    String locatorProdus5Xpath="//*[@id=\"inventory_container\"]/div/div[1]";
//    String locatorProdus6Xpath="//*[@id=\"inventory_container\"]/div/div[2]";

    //!!!!!!!!!!!!!!!! locator pret produs!!!!!!!!!!!!

    String locatorPretProdus1ByCsss="div:nth-of-type(1) > .inventory_item_description > .pricebar > .inventory_item_price";
    String locatorPretProdus2ByCsss="div:nth-of-type(2) > .inventory_item_description > .pricebar > .inventory_item_price";
    String locatorPretProdus3ByCsss="div:nth-of-type(3) > .inventory_item_description > .pricebar > .inventory_item_price";
    String locatorPretProdus4ByCsss="div:nth-of-type(4) > .inventory_item_description > .pricebar > .inventory_item_price";
    String locatorPretProdus5ByCsss="div:nth-of-type(5) > .inventory_item_description > .pricebar > .inventory_item_price";
    String locatorPretProdus6ByCsss="div:nth-of-type(6) > .inventory_item_description > .pricebar > .inventory_item_price";

    //!!!!!!!!!!!!!!!!locatori pagina checkout step one!!!!!!!!!!!!!!!!!

   String locatorCampFirstNameByID="first-name";
   String locatorCampLastNameByID="last-name";
   String locatorCampZipCodeByID="postal-code";
   String locatorMesajEroareContinueCss="h3";

    //!!!!!!!!!!!!!!!!!pret produse!!!!!!!!!!!!!!!!!!!

    String pretProdus1="$29.99";
    String pretProdus2="$9.99";
    String pretProdus3="$15.99";
    String pretProdus4="$49.99";
    String pretProdus5="$7.99";
    String pretProdus6="$15.99";

    //!!!!!!!!!!!!!!!!!locator inventar produs!!!!!!!!!!!!

    String fisier1ImagineDenumire="sauce-backpack-1200x1500.0a0b85a3.jpg";
    String fisier2ImagineDenumire="bike-light-1200x1500.37c843b0.jpg";
    String fisier3ImagineDenumire="bolt-shirt-1200x1500.c2599ac5.jpg";
    String fisier4ImagineDenumire="sauce-pullover-1200x1500.51d7ffaf.jpg";
    String fisier5ImagineDenumire="red-onesie-1200x1500.2ec615b2.jpg";
    String fisier6ImagineDenumire="red-tatt-1200x1500.30dadef4.jpg";
//
    //!!!!!!!!!!!!!!!!!Descriere Produs!!!!!!!!!!!!!!!!!!!!!!
    String descriereProdus1="carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.";
    String descriereProdus2="A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.";
    String descriereProdus3="Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.";
    String descriereProdus4="It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.";
    String descriereProdus5="Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.";
    String descriereProdus6="This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.";

    // !!!!!!!!!!!!!!variabila parola!!!!!!!!!!!!!!!

    String password="secret_sauce";

    //!!!!!!!!!!!!!!! pentru testare !!!!!!!!!!!!!!!!

    //user
    String user=user1;

    //url-uri

    String urlAbout="https://saucelabs.com/";
    String urlCart="https://www.saucedemo.com/cart.html";
    String urlChechoutStepOne="https://www.saucedemo.com/checkout-step-one.html";
    String urlChechoutStepTwo="https://www.saucedemo.com/checkout-step-two.html";
    String urlInventoryAllItem="https://www.saucedemo.com/inventory.html";
    String urlPaginaDeStart="https://www.saucedemo.com/";
    //!!!!!!!!!!!!!!!!!!!mesaje de eroare la logare !!!!!!!!!!!

    String mesajDeEroareUserLipsa="Epic sadface: Username is required";
    String mesajDeEroarePsswordLipsa="Epic sadface: Password is required";
    String mesajDeEroareUserInchis="Epic sadface: Sorry, this user has been locked out.";
    String mesajDeEroareParolaGresita="Epic sadface: Username and password do not match any user in this service";

    //!!!!!!!!!!!!!!!!!!!mesaj de eroare completare formular Checkout/Continue!!!!!!!!!!!!

    String mesajDeEroareContinueFaraNume="Error: First Name is required";
    String mesajDeEroareContinueLastName="Error: Last Name is required";
    String mesajDeEroareContinueZip="Error: Postal Code is required";

    //!!!!!!!!!!!!!!!!!!mesaj de eroare la picare test!!!!!!!!!!!!

    String mesajDeEroarePicareTestLogin="mesajul de eroare login nu corespunde asteptarilor";

@AfterMethod
    public void inchideBrowser()
    {
            driver.quit();
    }

}
