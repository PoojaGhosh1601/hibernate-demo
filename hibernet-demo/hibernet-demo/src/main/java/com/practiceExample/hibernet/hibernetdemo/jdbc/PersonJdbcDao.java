package com.practiceExample.hibernet.hibernetdemo.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.practiceExample.hibernet.hibernetdemo.entity.Person;

@Repository
public class PersonJdbcDao {
	@Autowired
	JdbcTemplate jdbcTempalte;

	public List<Person> findAll() {
		return jdbcTempalte.query("select * from person", new BeanPropertyRowMapper(Person.class));

	}
	
	public List<Person> findAllByCustomRowapper() {
		return jdbcTempalte.query("select * from person", new PersonRowMapper());

	}

	public Person findById(int id) {
		return jdbcTempalte.queryForObject("select * from person where id =?", new Object[] { id },
				new BeanPropertyRowMapper<Person>(Person.class));

	}
	
	public int insert(Person person) {
		return jdbcTempalte.update("insert into person(id,name,location,birth_date) values(?,?,?,?)",
				new Object[] { person.getId(), person.getName(), person.getLocation(), person.getBirthDate() });

	}

	public int Update(Person person) {
		return jdbcTempalte.update("update person set name =?, location=?,birth_date where id=?",
				new Object[] { person.getName(), person.getLocation(), person.getBirthDate(), person.getId() });

	}

	public int deleteById(int id) {
		return jdbcTempalte.update("delete from person where id=?", id);
	}

}
