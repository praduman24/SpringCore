package org.example.config;

import org.example.service.Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"org.example"})
public class Config {

  /*  @Bean("car")
    public Car getCar(){
        Car c = new Car();
        c.setId(1L);
        c.setName("Audi");
        c.setColour("black");
        c.setEngin(getEngin());
        return c;
    }

    public Engin getEngin(){
        Engin eng = new Engin();
        eng.setId(1L);
        eng.setName("Tarbo");
        eng.setHorsepower(5000L);
        return eng;
    }*/

    @Bean("service")
    public Service getService(){
        Service service = new Service();
        service.setJdbcTemplate(getTemplate());
        return service;
    }


    public JdbcTemplate getTemplate(){
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(getDataSource());
        return template;
    }


    public DataSource getDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost/sys");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return dataSource;
    }

}
