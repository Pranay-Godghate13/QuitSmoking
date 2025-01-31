package com.quitsmoking.quitsmoking.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.quitsmoking.quitsmoking.model.Person;

@Repository
public class PersonRepo {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;

    }
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Person person)
    {
        String sql="insert into Person values (?,?,?,?,?,?,?)";
        int rows=jdbcTemplate.update(sql, person.getId(),person.getNam(),person.getAge(),person.getGender(),person.getYears(),person.getMonths(),person.getN());
        System.out.println("Numbers of rows affected "+rows);
    }

    

    

    public List<Person> findAll()
    {
        String sql="select * from Person";
        RowMapper rowMapper=new RowMapper<Person>() {

            @Override
            public Person mapRow(ResultSet rs, int no) throws SQLException {
                Person p=new Person();
                p.setId(rs.getInt(1));
                p.setNam(rs.getString(2));
                p.setAge(rs.getInt(3));
                p.setGender(rs.getString(4));
                p.setYears(rs.getInt(5));
                p.setMonths(rs.getInt(6));
                p.setN(rs.getInt(7));
                return p;
            }
            
        };
        List<Person> result=jdbcTemplate.query(sql,rowMapper);
        return result;
    }

}
