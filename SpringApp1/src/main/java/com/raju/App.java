package com.raju;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(JavaConfig.class);
        StudentBean sb=(StudentBean)ctx.getBean("id1");
        sb.printmarks();
    }
}
