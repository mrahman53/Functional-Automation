import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by rrt on 4/26/2015.
 */
public class NavTab extends CnnBase {

    @Test
    public void tab()throws InterruptedException{
        List<WebElement> tabs = getWebElementsByXpath(".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li");
        for(int i=1; i<tabs.size(); i++) {
            if(i==3) {
                clickByXpath(".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[" + i + "]/a");
            }
            navigateBack();
            sleepFor(3);
        }
    }
}
