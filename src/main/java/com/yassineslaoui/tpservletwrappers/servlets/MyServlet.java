package com.yassineslaoui.tpservletwrappers.servlets;

import javax.servlet.*;
import java.io.*;
import java.util.Locale;

public class MyServlet extends GenericServlet {
    public void service(ServletRequest request, ServletResponse response) throws IOException {
        System.out.println("Servlet is called");
        response.setContentType("text/html");
        String name = request.getParameter("username");
        PrintWriter out = response.getWriter();
        out.println(name + "<br>");
        Locale loc = response.getLocale();
        out.println("Locale set for this application is " + loc.toString());
        out.close();
    }
}
