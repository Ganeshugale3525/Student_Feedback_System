package org.com.FeedbackSystem.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import org.com.FeedbackSystem.model.admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("repo")
public class AdminRepo {
	@Autowired
JdbcTemplate template;

public List<admin> chackAdmin(admin a) {
List<admin> list=new ArrayList<admin>();
RowMapper<admin> r = new RowMapper<admin>() {

	@Override
	public admin mapRow(ResultSet rs, int rowNum) throws SQLException {
		admin c = new admin();
		c.setAid(rs.getInt(1));
		c.setName(rs.getString(2));
		c.setEmail(rs.getString(3));
		c.setContact(rs.getString(4));
		c.setPassword(rs.getString(5));
		
		return c;
	}

};
list = template.query("select * from admininfo where email='"+a.getEmail()+"' and password='"+a.getPassword()+"'", r);

		
	return list;
}

}

