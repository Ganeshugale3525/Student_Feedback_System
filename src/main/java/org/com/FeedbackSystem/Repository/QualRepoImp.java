package org.com.FeedbackSystem.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.com.FeedbackSystem.model.Qualification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

@Repository("repo`")
public class QualRepoImp implements QualRepo{
	@Autowired
	JdbcTemplate template;

	@Override
	public boolean AddQual(final Qualification q) {
		int  val=template.update("insert into qualification values('0',?)",new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1,q.getName());
			}
			
		});
		
		if(val>0)
			return true;
		else
		return false;
	}
}
