import news.Pages;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by rrt on 4/26/2015.
 */
    public class TechNewsContents extends CnnBase {

    Pages page = null;
    String techHeadLine = "This website claims to tell you in seconds";
    @Test
    public void getTechNews()throws InterruptedException{

        page = PageFactory.initElements(driver,Pages.class);

        page.clickByElement(page.politics);
        navigateBack();
        page.clickByElement(page.tech);
        String news = getTextByCss(".cd__headline-text");
        System.out.println(news);
        Assert.assertEquals(news, techHeadLine);
        sleepFor(1);
        String description = getTextByCss(".cd__description");
        System.out.println(description);
        sleepFor(2);

    }

}
