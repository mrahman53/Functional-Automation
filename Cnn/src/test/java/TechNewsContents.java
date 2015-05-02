import news.Pages;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by rrt on 4/26/2015.
 */
public class TechNewsContents extends CnnBase {

    Pages page = null;
    @Test
    public void getTechNews()throws InterruptedException{

        page = PageFactory.initElements(driver,Pages.class);

        page.clickByElement(page.politics);
        navigateBack();
        page.clickTech();

        String news = getTextByCss(".cd__headline-text");
        System.out.println(news);
        sleepFor(2);


    }



}
