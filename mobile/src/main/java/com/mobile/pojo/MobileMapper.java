package com.mobile.pojo;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MobileMapper implements RowMapper<Mobile> {
	public Mobile mapRow(ResultSet resultset, int i ) throws SQLException{
		Mobile mobile = new Mobile();
		mobile.setId(resultset.getInt("id"));
		mobile.setName(resultset.getString("name"));
		mobile.setPrice(resultset.getString("price"));
		mobile.setQty(resultset.getString("quantity"));
		mobile.setDesc(resultset.getString("desc"));
		return mobile;
		
	}

}
