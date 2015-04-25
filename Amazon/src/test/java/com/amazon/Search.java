package com.amazon;

import homeFeatures.AmazonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by rrt on 4/19/2015.
 */
public class Search extends AmazonBase {

    @Test
    public void searchItems()throws InterruptedException{
        setItems(AmazonBase.list);
        getItems();
        List<String> listMenu = searchDropDownMenu("#searchDropdownBox option");
        Assert.assertEquals(listMenu,AmazonBase.menu);
        displayText(listMenu);
        for(String item: listMenu){
            typeAndEnterByCss("#twotabsearchtextbox", item);
            sleepFor(4);
        }
    }
}
