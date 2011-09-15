package com.example;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;

import com.example.page.HomePage;

/**
 * Simple test using the WicketTester
 */
public class TestHomePage {

    private WicketTester tester;

    @Test
    public void homepageRendersSuccessfully() {
        // start and render the test page
        this.tester.startPage(HomePage.class);

        // assert rendered page class
        this.tester.assertRenderedPage(HomePage.class);
    }

    @Before
    public void setUp() {
        this.tester = new WicketTester(new WicketApplication());
    }
}
