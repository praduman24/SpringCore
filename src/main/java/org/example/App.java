package org.example;

import org.example.car.Car;
import org.example.car.CarBuilder;
import org.example.config.Config;
import org.example.engin.Engin;
import org.example.engin.EnginBuilder;
import org.example.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
public class App 
{
    private Service service;

    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        service = (Service) context.getBean("service");
    }


    public static void main( String[] args )
    {
        // 1> AnnotaionConfigApplicationContext
        // 2> FileSystemXmlApplicationContext
        // 3> ClassPathXmlApplicationContext
       // ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
       App app = new App();
        app.saveObj();
    }

    public void saveObj(){
        Engin eng = EnginBuilder.getEnginBuilder().setId(1L).setName("tarbo").setHorsepower(5000L).build();
        Car c = CarBuilder.getCarBuilder().setId(1L).setName("Alto").setColour("Black").setEng(eng).build();
        service.saveCar(c);
    }
}
