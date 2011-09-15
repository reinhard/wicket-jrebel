package com.example;

import org.apache.wicket.protocol.http.WebApplication;

import com.example.page.HomePage;

public class WicketApplication extends WebApplication {

    @Override
    public Class<HomePage> getHomePage() {
        return HomePage.class;
    }

    @Override
    protected void init() {
    	super.init();
    	
//    	this.mountBookmarkablePage("test-mount", HomePage.class);
    }
}
