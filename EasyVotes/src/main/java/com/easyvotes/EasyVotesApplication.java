package com.easyvotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


@SpringBootApplication
public class EasyVotesApplication implements CommandLineRunner {
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//	
	public static void main(String[] args) {
		
		SpringApplication.run(EasyVotesApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
//	@Override
//	public void run(String... args) throws Exception{
//		String sql= "SELECT * FROM STUDENTS";
//		java.util.List<Student> students = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Student.class));
//		students.forEach(System.out :: println);
//	}

}
