package com.mypackage.Springbootapp;

import java.sql.ResultSet;

import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class categorymapper implements  RowMapper<category> {
	public category mapRow(ResultSet rs, int rowNum) throws SQLException {
	      category catg = new category();
	      catg.setcat_id(rs.getInt("cat_id"));
	      catg.setcat_name(rs.getString("cat_name"));
	      
	      return catg;
	   }
}
