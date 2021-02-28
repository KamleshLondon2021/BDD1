package BDD1.BaseClassPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFectory {

    public static WebDriver driver;

    public DriverFectory(){
        PageFactory.initElements(driver,this);

    }
    public void openbrowser(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"consent_prompt_submit\"]")).click();
    }
    public void closebrowser(){

        driver.quit();
    }
}
