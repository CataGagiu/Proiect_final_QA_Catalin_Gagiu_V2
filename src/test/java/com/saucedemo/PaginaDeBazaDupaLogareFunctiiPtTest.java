package com.saucedemo;

import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.File;

public class PaginaDeBazaDupaLogareFunctiiPtTest extends LoginBazaFunctiiPtTest
{
    @BeforeMethod

   public void logareUser()
   {
       introduUserDefinitInPaginaDeBaza();
       introduParolaSecretSauce();
       apasaButonByID(locatorButonLoginByID);
       apasareButonMeniu();
   }

    // verificare existenta buton AllItem
    public void verificareExistentaButonAllItem()
    {

        verificareExistentaElementByXpath(locatorButonAllItemByXpath);
    }

   // verificare daca exista buton LOGOUT
    public void verificareExistenteiLogout()
    {
          verificareExistentaElementByXpath(locatorButonLogoutByXpath);
    }

    // verificare existenta buton reset About
    public void verificareExistentaAbout()
    {
        verificareExistentaElementByXpath(locatorButonAboutDinMeniuStangaSusByXpath);
    }

    //verificare existenta buton Resset App State
    public void verificareExistentaRessetAppState()
    {
        verificareExistentaElementByXpath(locatorButonRessetAppStateByXpat);
    }

    //verificari apasare butoane meniu stanga sus

    public void apasareButoanAllItems() // in lucru fara verificare functionalitate
    {
        apasaButonByXpath(locatorButonAllItemByXpath);
    }
    public void apasaButonLogout()// finalizat
    {
        apasaButonByXpath(locatorButonLogoutByXpath);
        verificareExistentaElementByID(locatorCampLoginUserByID);
    }
    public void apasaButonAbout()// finalizat
    {
        apasaButonByXpath(locatorButonAboutDinMeniuStangaSusByXpath);
        apasaButonByXpath(locatorButonCookieInPaginaAboutByXpath);
        verificarePaginaUrl(urlAbout);
    }

    public void verificaExistentaCart()
    {
        verificareExistentaElementByXpath(locatorButonCartDreaptaSusByXpath);
    }

    //Cart

    public void apasaButonCart()
    {
        apasaButonByXpath(locatorButonCartDreaptaSusByXpath);
    }
    public void verificaRezultatButonCartApasat()
    {
        verificarePaginaUrl(urlCart);
    }
    public void apasaButonCheckout()
    {
        apasaButonByID(locatorButonCheckoutByID);
    }
    public void verificaRezultatButonCheckoutApasat()
    {
        verificarePaginaUrl(urlChechoutStepTwo);
    }
    public void verificareExistentaButonContinueShopping()
    {
        verificareExistentaElementByNume(locatorButonContinueShopingByname);
    }
    public void apasaButonContinueShopping()
    {
        apasaButonByNume(locatorButonContinueShopingByname);
    }
    public void verificareExistentaBadgeCart()
    {
        WebElement badge=driver.findElement(By.xpath(locatorBadgeByXpath));
        assert  badge.isDisplayed();
    }
    public boolean verificareExistentaBadgeAfisat()
    {
        WebElement badge=driver.findElement(By.xpath(locatorBadgeByXpath));
        return  badge.isDisplayed();
    }
    //verificare butoane Add To Chart

    public void verificareExistentaButonAddToChart1()
    {
        verificareExistentaElementByID(locatorButonAddToChartProdus1ByID);

    }
    public void verificareExistentaButonAddToChart2()
    {
        verificareExistentaElementByID(locatorButonAddToChartProdus2ByID);
    }
    public void verificareExistentaButonAddToChart3()
    {
        verificareExistentaElementByID(locatorButonAddToChartProdus3ByID);
    }
    public void verificareExistentaButonAddToChart4()
    {
        verificareExistentaElementByID(locatorButonAddToChartProdus4ByID);
    }
    public void verificareExistentaButonAddToChart5()
    {
        verificareExistentaElementByID(locatorButonAddToChartProdus5ByID);
    }
    public void verificareExistentaButonAddToChart6()
    {
        verificareExistentaElementByID(locatorButonAddToChartProdus6ByID);
    }

    //apasa butoane AddToChart

    public void apasaButonAddToChart1()
    {
        apasaButonByID(locatorButonAddToChartProdus1ByID);
        assert verificareExistentaBadgeAfisat();

    }
    public void apasaButonAddToChart2()
    {
        apasaButonByID(locatorButonAddToChartProdus2ByID);
    }
    public void apasaButonAddToChart3()
    {
        apasaButonByID(locatorButonAddToChartProdus3ByID);
    }
    public void apasaButonAddToChart4()
    {
        apasaButonByID(locatorButonAddToChartProdus4ByID);
    }
    public void apasaButonAddToChart5()
    {
        apasaButonByID(locatorButonAddToChartProdus5ByID);
    }
    public void apasaButonAddToChart6()
    {
        apasaButonByID(locatorButonAddToChartProdus6ByID);
    }

    //verifica daca dupa apasare Add to chart apare Remove
    public void verificareModificareMesajButonAddToChartInRemoveProdus1()
    {
        verificareExistentaElementByID(locatorButonRemoveProdus1ByID);
    }
    public void verificareModificareMesajButonAddToChartInRemoveProdus2()
    {
        verificareExistentaElementByID(locatorButonRemoveProdus2ByID);
    }
    public void verificareModificareMesajButonAddToChartInRemoveProdus3()
    {
        verificareExistentaElementByID(locatorButonRemoveProdus3ByID);
    }
    public void verificareModificareMesajButonAddToChartInRemoveProdus4()
    {
        verificareExistentaElementByID(locatorButonRemoveProdus4ByID);
    }
    public void verificareModificareMesajButonAddToChartInRemoveProdus5()
    {
        verificareExistentaElementByID(locatorButonRemoveProdus5ByID);
    }
    public void verificareModificareMesajButonAddToChartInRemoveProdus6()
    {
        verificareExistentaElementByID(locatorButonRemoveProdus6ByID);
    }

    // apasa butoanele Remove

    public void apasaButonRemoveProdus1()
    {
        apasaButonByID(locatorButonRemoveProdus1ByID);
    }
    public void apasaButonRemoveProdus2()
    {
        apasaButonByID(locatorButonRemoveProdus2ByID);
    }
    public void apasaButonRemoveProdus3()
    {
        apasaButonByID(locatorButonRemoveProdus3ByID);
    }
    public void apasaButonRemoveProdus4()
    {
        apasaButonByID(locatorButonRemoveProdus4ByID);
    }
    public void apasaButonRemoveProdus5()
    {
        apasaButonByID(locatorButonRemoveProdus5ByID);
    }
    public void apasaButonRemoveProdus6()
    {
        apasaButonByID(locatorButonRemoveProdus6ByID);
    }

    //verificare imagine produs

    public void verificareNumeFisierByXpath(String locatieImagine,String denumireFisierAsteptat)
    {
        WebElement imagine=driver.findElement(By.xpath(locatieImagine));
        String src=imagine.getAttribute("src");
        String denumireFisier=FilenameUtils.getName(src);
        Assert.assertEquals(denumireFisier,denumireFisierAsteptat);
    }

    public void verificareImagineProdus1()
    {
        verificareNumeFisierByXpath(locatorImagineProdus1ByXpath,fisier1ImagineDenumire);
    }
    public void verificareImagineProdus2()
    {
        verificareNumeFisierByXpath(locatorImagineProdus2ByXpath,fisier2ImagineDenumire);
    }
    public void verificareImagineProdus3()
    {
        verificareNumeFisierByXpath(locatorImagineProdus3ByXpath,fisier3ImagineDenumire);
    }
    public void verificareImagineProdus4()
    {
        verificareNumeFisierByXpath(locatorImagineProdus4ByXpath,fisier4ImagineDenumire);
    }
    public void verificareImagineProdus5()
    {
        verificareNumeFisierByXpath(locatorImagineProdus5ByXpath,fisier5ImagineDenumire);
    }
    public void verificareImagineProdus6()
    {
        verificareNumeFisierByXpath(locatorImagineProdus6ByXpath,fisier6ImagineDenumire);
    }
    //verificare pret produs
    public void verificaPretProdus1()
    {
        verificaPretProdusByCss(pretProdus1,locatorPretProdus1ByCsss);
    }
    public void verificaPretProdus2()
    {
        verificaPretProdusByCss(pretProdus2,locatorPretProdus2ByCsss);
    }
    public void verificaPretProdus3()
    {
        verificaPretProdusByCss(pretProdus3,locatorPretProdus3ByCsss);
    }
    public void verificaPretProdus4()
    {
        verificaPretProdusByCss(pretProdus4,locatorPretProdus4ByCsss);
    }
    public void verificaPretProdus5()
    {
        verificaPretProdusByCss(pretProdus5,locatorPretProdus5ByCsss);
    }
    public void verificaPretProdus6()
    {
        verificaPretProdusByCss(pretProdus6,locatorPretProdus6ByCsss);
    }


    //

}