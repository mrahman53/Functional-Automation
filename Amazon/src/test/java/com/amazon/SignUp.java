package com.amazon;

import baseApi.Base;
import org.testng.annotations.Test;

/**
 * Created by rrt on 4/12/2015.
 */
public class SignUp extends Base {

    @Test
    public void signIn()throws InterruptedException{
        sleepFor(2);
        clickByCss("#nav-tools #nav-link-yourAccount .nav-line-1");
        clickByCss(".nav-action-inner");
        sleepFor(4);
    }
}
