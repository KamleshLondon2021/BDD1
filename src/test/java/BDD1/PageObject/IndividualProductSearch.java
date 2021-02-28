package BDD1.PageObject;

import BDD1.BaseClassPackage.DriverFectory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndividualProductSearch extends DriverFectory {

    @FindBy(id = "searchTerm")
    WebElement SearchTexBox;

    @FindBy(className = "_2mKaC")
    WebElement magnifierGlass;


    public void dosearch(String item){
        SearchTexBox.sendKeys(item);
    }

    public void searchbuttonclick(){
        magnifierGlass.click();

    }

}

