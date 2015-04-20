package homeFeatures;

import baseApi.Base;

import java.util.List;

/**
 * Created by rrt on 4/19/2015.
 */
public class AmazonHomePage extends Base{

    public void search(String locator, String value){
       typeByCss(locator, value);
    }

    public List<String> searchDropDownMenu(String locator){
        List<String> menuList = getListOfTextByCss(locator);

        return menuList;

    }
}
