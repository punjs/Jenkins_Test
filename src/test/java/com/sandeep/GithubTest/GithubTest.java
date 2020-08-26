package com.sandeep.GithubTest;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class GithubTest
{

    @Test
    public static void testWebhooks()
    {
        System.out.println("I am executing webhook of Github");
        Assert.assertEquals(true, true);

    }

}
