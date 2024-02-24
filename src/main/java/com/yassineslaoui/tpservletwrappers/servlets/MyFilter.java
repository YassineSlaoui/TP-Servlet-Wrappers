package com.yassineslaoui.tpservletwrappers.servlets;

import com.yassineslaoui.tpservletwrappers.wrappers.RequestWrapper;
import com.yassineslaoui.tpservletwrappers.wrappers.ResponseWrapper;

import java.io.*;
import javax.servlet.*;

public class MyFilter implements Filter {
    public void init(FilterConfig filterConfig) {
    }

    public void destroy() {
    }

    //This method is called each time a client requests for a web resource i.e. preprocessing request
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<b> <i>Filter intercepted request and response, passing them to respective Wrapper classes</i> </b> <br/>");

        //Calling the constructor of request and response wrapper classes
        RequestWrapper requestWrapper = new RequestWrapper(request);
        ResponseWrapper responseWrapper = new ResponseWrapper(response);

        //This method calls the next filter in the chain
        chain.doFilter(requestWrapper, responseWrapper);
    }
}
