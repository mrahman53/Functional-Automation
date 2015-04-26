package homeFeatures;

import baseApi.Base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rrt on 4/25/2015.
 */
public class AmazonBase extends Base {
    public static List<String> menu = new ArrayList<String>();
    public static String [] list = {"All Departments"
            ,"Amazon Home Services"
            ,"Amazon Instant Video"
            ,"Appliances"
            ,"Apps & Games"
            ,"Arts, Crafts & Sewing"
            ,"Automotive"
            ,"Baby"
            ,"Beauty"
            ,"Books"
            ,"CDs & Vinyl"
            ,"Cell Phones & Accessories"
            ,"Clothing, Shoes & Jewelry"
            ,"   Women"
            ,"   Men"
            ,"   Girls"
            ,"   Boys"
            ,"   Baby"
            ,"Collectibles & Fine Art"
            ,"Computers"
            ,"Credit and Payment Cards"
            ,"Digital Music"
            ,"Electronics"
            ,"Gift Cards"
            ,"Grocery & Gourmet Food"
            ,"Health & Personal Care"
            ,"Home & Kitchen"
            ,"Industrial & Scientific"
            ,"Kindle Store"
            ,"Luggage & Travel Gear"
            ,"Magazine Subscriptions"
            ,"Movies & TV"
            ,"Musical Instruments"
            ,"Office Products"
            ,"Patio, Lawn & Garden"
            ,"Pet Supplies"
            ,"Prime Pantry"
            ,"Software"
            ,"Sports & Outdoors"
            ,"Tools & Home Improvement"
            ,"Toys & Games"
            ,"Video Games"
            , "Wine"} ;
    public void setItems(String [] list){
        for(String st:list){
            menu.add(st);
        }
    }
    public List<String> getItems(){
       return menu;
    }

    public void search(String locator, String value){
        typeByCss(locator, value);
    }

    public List<String> searchDropDownMenu(String locator){
        List<String> menuList = getListOfTextByCss(locator);

        return menuList;

    }
}
