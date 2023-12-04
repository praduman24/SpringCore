package org.example.service;

import org.example.car.Car;
import org.example.engin.Engin;
import org.example.engin.EnginBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

//@Component
public class Service {

//    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void saveCar(Car car){

        String query = "insert into engin(id,name,horsepower) values(?,?,?)";

        String query2 = "insert into car(id,name,colour,engin) values(?,?,?,?)";

        String query3 = "select * from engin eng where eng.id = ?";

        jdbcTemplate.update(query,car.getEngin().getId(),car.getEngin().getName(),car.getEngin().getHorsepower());
        Engin engin = jdbcTemplate.queryForObject(query3, new Long[]{car.getEngin().getId()}, new RowMapper<Engin>() {
            @Override
            public Engin mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new EnginBuilder().setId(rs.getLong(0)).setName(rs.getString(1)).setHorsepower(rs.getLong(2)).build();
            }
        });
        jdbcTemplate.update(query2,car.getId(),car.getName(),car.getColour(),engin.getId());

    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public Service setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        return this;
    }
}
