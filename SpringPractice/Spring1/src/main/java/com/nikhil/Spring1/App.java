package com.nikhil.Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nikhil.Spring1.config.AppConfig;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        
        Alien alien=context.getBean(Alien.class);
        System.out.println(alien.getAge());
        alien.code();
        
//        Desktop dt=context.getBean("desk",Desktop.class);
//        dt.compile(); 
//        
//        Alien alien=(Alien) context.getBean("alien");
//        alien.code();
//        
//        System.out.println(alien.getAge());
        
    }
}
