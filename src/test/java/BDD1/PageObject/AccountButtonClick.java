package BDD1.PageObject;

import BDD1.BaseClassPackage.DriverFectory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountButtonClick extends DriverFectory {


    // @FindBy(id = "_2wsKA")
    @FindBy(xpath = "//span[contains(text(),'Account')]")
    WebElement AccountClick;


public void AccountButtonClick(){

        AccountClick.click();
    }
    public void IntheAccountpage(){

        String url = driver.getCurrentUrl();
        Assert.assertEquals(url,"https://www.argos.co.uk/account/login?clickOrigin=header:home:account");

    }
}
