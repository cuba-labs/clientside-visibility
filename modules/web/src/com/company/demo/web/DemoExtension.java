package com.company.demo.web;

import com.vaadin.annotations.JavaScript;
import com.vaadin.server.AbstractJavaScriptExtension;
import com.vaadin.ui.CustomLayout;

@JavaScript("vaadin://demo-extension.js")
public class DemoExtension extends AbstractJavaScriptExtension {
    public DemoExtension(CustomLayout target) {
        super(target);
    }
}