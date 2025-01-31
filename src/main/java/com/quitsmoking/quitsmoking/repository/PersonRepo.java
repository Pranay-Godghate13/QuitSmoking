package com.quitsmoking.quitsmoking.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.quitsmoking.quitsmoking.model.Person;

@Repository
public class PersonRepo {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;

    }

    public void save(Person person)
    {
        String sql="insert into Person values (?,?,?,?,?,?,?)";
        int rows=jdbcTemplate.update(sql, person.getId(),person.getNam(),person.getAge(),person.getGender(),person.getYears(),person.getMonths(),person.getN());
        System.out.println("Numbers of rows affected "+rows);
    }

    

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public ArrayList<Person> findAll()
    {
        return new ArrayList<>();
    }

}
