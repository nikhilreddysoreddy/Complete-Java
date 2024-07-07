package com.nikhil.SpringServlet;

import javax.servlet.Servlet;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App 
{
    public static void main( String[] args ) throws LifecycleException
    {
        System.out.println( "Hello World!" );
        Tomcat tomcat=new Tomcat();
        tomcat.setPort(8082);
        
        Context context=tomcat.addContext("",null);
        Tomcat.addServlet(context, "s1", new HelloServlet());
        context.addServletMappingDecoded("/hello", "s1");
        
        tomcat.start();
        tomcat.getServer().await();
//        tomcat.stop();
    }
}
