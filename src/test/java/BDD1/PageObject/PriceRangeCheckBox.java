package BDD1.PageObject;

import BDD1.BaseClassPackage.DriverFectory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PriceRangeCheckBox extends DriverFectory {

    @FindBy(xpath = "//body/main[@id='app']/div[1]/div[3]/div[1]/div[6]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]")
    WebElement PriceRange;

    public void PriceCheckbox(){

        PriceRange.click();

    }

}
