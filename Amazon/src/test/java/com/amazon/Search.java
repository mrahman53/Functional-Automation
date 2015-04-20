package com.amazon;

import homeFeatures.AmazonHomePage;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by rrt on 4/19/2015.
 */
public class Search extends AmazonHomePage {

    @Test
    public void searchItems()throws InterruptedException{
        List<String> listMenu = searchDropDownMenu("#searchDropdownBox option");
        displayText(listMenu);
        for(String item: listMenu){
           selectElementByVisibleText("#searchDropdownBox", item);
            sleepFor(2);
        }
    }
}
