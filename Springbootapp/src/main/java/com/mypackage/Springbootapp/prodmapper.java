package com.mypackage.Springbootapp;

import java.sql.ResultSet;

import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class prodmapper implements RowMapper<product> {
   public product mapRow(ResultSet rs, int rowNum) throws SQLException {
      product pro = new product();
      pro.setprod_id(rs.getInt("prod_id"));
      pro.setprod_name(rs.getString("prod_name"));
      
      return pro;
   }

	
	
}
