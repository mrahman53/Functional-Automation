import baseApi.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by rrt on 4/11/2015.
 */
public class CnnHome extends Base {

    @Test
    public void homePage() throws InterruptedException{
        driver.findElement(By.xpath(".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[3]/a")).click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(4000);

        System.out.println("Marvin");
    }
}
