package com.yassineslaoui.tpservletwrappers.wrappers;

import javax.servlet.*;

public class RequestWrapper extends ServletRequestWrapper {
    public RequestWrapper(ServletRequest req) {
        // Calls the ServletRequestWrapper superclass' constructor i.e. ServletRequest.
        super(req);
    }

    // Overriding the ServletRequest's getParameter method.
    public String getParameter(String str) {
        // Calling the superclass method i.e. ServletRequest's getParameter(String) method.
        String name = super.getParameter(str);
        if (name.isEmpty()) {
            name = "Please, enter your name in the form";
        }
        return name;
    }
}
