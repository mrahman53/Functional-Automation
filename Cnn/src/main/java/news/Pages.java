package news;

import baseApi.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by rrt on 4/26/2015.
 */
public class Pages extends Base {

    public WebDriver driver = null;

    public WebElement clickTech(){
        return new Pages().tech;
    }
    public WebElement clickWorld(){
        return new Pages().world;
    }
    public void clickByElement(WebElement element){
        element.click();
    }
    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[1]/a")
    public WebElement US;

    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[2]/a")
    public WebElement world;

    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[3]/a")
    public WebElement politics;

    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[4]/a")
    public WebElement tech;

    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[5]/a")
    public WebElement health;

    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[6]/a")
    public WebElement entertainment;

    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[7]/a")
    public WebElement living;

    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[8]/a")
    public WebElement travel;

    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[9]/a")
    public WebElement money;

    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[10]/a")
    public WebElement sports;

}
