package com.amazon;

import baseApi.Base;
import homeFeatures.AmazonBase;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by rrt on 4/11/2015.
 */
public class AmazonHome extends AmazonBase {

    @Test
    public void homePageOfAmazon()throws InterruptedException{
        System.out.println(driver.getCurrentUrl());
        typeAndEnterByCss("#twotabsearchtextbox", "book");
        sleepFor(4);
        List<String> list = getListOfTextByCss("#nav-subnav .nav-a");
        displayText(list);
        // List<WebElement> bookNavBar = getWebElements("#nav-subnav .nav-a");
        for(int i=1; i<list.size(); i++){
           clickByText(list.get(i));
        }
        sleepFor(2);
    }
}
