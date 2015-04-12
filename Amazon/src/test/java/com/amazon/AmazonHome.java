package com.amazon;

import baseApi.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by rrt on 4/11/2015.
 */
public class AmazonHome extends Base {

    @Test
       public void homePageOfAmazon()throws InterruptedException{
        System.out.println(driver.getCurrentUrl());
        typeAndEnterByCss("#twotabsearchtextbox", "book");
        sleepFor(4);
        List<String> list = getTextByCss("#nav-subnav .nav-a");
        displayText(list);
        // List<WebElement> bookNavBar = getWebElements("#nav-subnav .nav-a");
        for(int i=1; i<list.size(); i++){
           clickByText(list.get(i));
        }
        sleepFor(2);
    }
}
