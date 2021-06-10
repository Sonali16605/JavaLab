package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;

/**
 *
 * @author mitali dubey
 */
public class first implements Servlet{
    ServletConfig conf;
    public void init(ServletConfig conf){
    this.conf=conf;
        System.out.println("Creating object");
    }
    public void service(ServletRequest req, ServletResponse resp)throws ServletException,IOException
    {
        System.out.println("servicing");
        //set the content type of the response
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<h1>this is my output from servlet method</h1>");
        out.println("<h1>Todays date and time is "+new Date().toString()+"</h1>");
    }
    public void destroy(){
        System.out.println("going to destory servlet object");
    }
    // non life cycle methods
    public ServletConfig getServletConfig()
    {
    return this.conf;
    }
    public String getServletInfo()
    {
    return "First servlet";
    }
}
