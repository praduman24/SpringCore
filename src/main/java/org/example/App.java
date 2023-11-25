package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // 1> AnnotaionConfigApplicationContext
        // 2> FileSystemXmlApplicationContext
        // 3> ClassPathXmlApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");

        Car c = (Car)context.getBean("car");

        System.out.println(c);
    }
}
