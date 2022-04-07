package com.practiceExample.hibernet.hibernetdemo;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practiceExample.hibernet.hibernetdemo.entity.Person;
import com.practiceExample.hibernet.hibernetdemo.jdbc.PersonJdbcDao;

@SpringBootApplication
public class HibernetDemoApplication implements CommandLineRunner{
	
	@Autowired
	PersonJdbcDao personJdbcDao;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(HibernetDemoApplication.class, args);
	}

	public void run(String... args) throws Exception {
		logger.info("All users -> {}", personJdbcDao.findAll());
		logger.info("\n user id 10001 -> {}", personJdbcDao.findById(10001));
		logger.info("All users by person row mapper-> {}", personJdbcDao.findAllByCustomRowapper());
		//LacalDateTime.now();
		//Person person = new Person(106,"Anna","Denver",LocalDate.now());
		//Person person2 = new Person(10001,"Anna","Dubai",LocalDate.now());
		
		//personJdbcDao.insert(person);
		//personJdbcDao.Update(person2);
		//System.out.println("Anna added");
	}

}
