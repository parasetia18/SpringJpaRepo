package com.example.demo;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	
	//@Autowired 
	//DataSource dataSource;
	
	/*
	 * @Autowired JdbcTemplate jdbc;
	 * 
	 * public String insertdata(User user) {
	 * 
	 * try { jdbc.update("insert into userdata(username,password) values(?,?)",user.
	 * getUsername(),user.getPassword()); return "successfully"; } catch(Exception
	 * e) { return e.toString(); } }
	 * 
	 * public List<User> findAll() {
	 * 
	 * String sql = "SELECT * FROM userdata";
	 * 
	 * List<User> customers = jdbc.query(sql,new BeanPropertyRowMapper(User.class));
	 * 
	 * return customers; }
	 */
}
