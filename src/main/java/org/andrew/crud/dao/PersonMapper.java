package org.andrew.crud.dao;

import org.andrew.crud.models.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person = new Person();

        person.setAge(rs.getInt("age"));
        person.setEmail(rs.getString("email"));
        person.setId(rs.getInt("id"));
        person.setName(rs.getString("name"));

        return person;
    }
}
