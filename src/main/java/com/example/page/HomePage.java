package com.example.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class HomePage extends WebPage {

    private static final long serialVersionUID = 1L;

    public HomePage() {
        this.add(new Label("version", this.getApplication().getFrameworkSettings().getVersion()));
    }
}
