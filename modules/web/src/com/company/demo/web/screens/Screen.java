package com.company.demo.web.screens;

import com.company.demo.web.DemoExtension;
import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.components.HtmlBoxLayout;
import com.vaadin.ui.CustomLayout;

import javax.inject.Inject;
import java.util.Map;

public class Screen extends AbstractWindow {
    @Inject
    private HtmlBoxLayout htmlBox;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        CustomLayout layout = htmlBox.unwrap(CustomLayout.class);
        new DemoExtension(layout);
    }
}