package com.myapp.Hibernate_1;

import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Configuration c=new Configuration().configure().addAnnotatedClass(Product.class);
    	
        System.out.println( "Hello World!" );
    }
}
