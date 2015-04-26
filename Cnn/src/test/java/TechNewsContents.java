import news.Pages;
import org.testng.annotations.Test;

/**
 * Created by rrt on 4/26/2015.
 */
public class TechNewsContents extends CnnBase {

    @Test
    public void getTechNews(){

        clickByWebElement(Pages.tech);
        String news = getTextByCss(".cd__content");
        System.out.println(news);


    }



}
