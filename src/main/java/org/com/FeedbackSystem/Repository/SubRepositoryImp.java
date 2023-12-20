package org.com.FeedbackSystem.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.com.FeedbackSystem.model.Submodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("SubRepo")
public class SubRepositoryImp implements SubRepository{
	@Autowired
	JdbcTemplate template;
	@Override
	public boolean addsub(final Submodel model){
		try {
		int val=template.update("insert into subject (id,subname)value('0',?)",new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1,model.getName());
			}
			
		});
		if(val>0)
		return true;
		
		else
			return false;
		}catch(Exception e)
		{
			return false;
		}
	}
	@Override
	public List<Submodel> viewSub(Submodel b) {
		List<Submodel> list=template.query("Select * from subject where status=1 order by id",new RowMapper<Submodel>() {

			@Override
			public Submodel mapRow(ResultSet rs, int rowNum) throws SQLException {
				Submodel m=new Submodel();
				m.setId(rs.getInt(1));
				m.setName(rs.getString(2));
				return m;
			} 
		});
		
		return list;
	}
	@Override
	public boolean updatesub(final Submodel m) {
		try {
		int val=template.update("update subject set subname=? where id=?", new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1,m.getName());
				ps.setInt(2,m.getId());
			}
		});
		if(val>0)
		return true;
		else
			return false;   }catch(Exception e) {return false;}   
	}
	@Override
	public boolean Disablesub( final Submodel m) {
		int val=template.update("update subject set status=0 where id=?",new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1,m.getId());
			}});
		return val>0?true:false;
	}
	@Override
//	public List<Submodel> SearchSub( final Submodel m) {
//		List<Submodel> list=template.query("Select * from subject where status=1 and subname='"+m.getName()+"'",new RowMapper<Submodel>() {
//
//			@Override
//			public Submodel mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Submodel subm=new Submodel();
//				subm.setId(rs.getInt(1));
//				subm.setName(rs.getString(2));
//				return subm;
//			}
//		});
//		return list;   
//	}
	public List<Submodel> SearchSub( String m) {
		List<Submodel> list=template.query("Select * from subject where status=1 and subname like '"+m+"%'",new RowMapper<Submodel>() {

			@Override
			public Submodel mapRow(ResultSet rs, int rowNum) throws SQLException {
				Submodel subm=new Submodel();
				subm.setId(rs.getInt(1));
				subm.setName(rs.getString(2));
				return subm;
			}
		});
		
		return list;
	}
	@Override
	public boolean EnableSubject(Submodel m) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean IsAvailableSub(String sub) {
		try {
			String s=template.queryForObject("select subname from subject where subname='"+sub+"'",String.class);
			return s.length()>0?true:false;
		}catch(Exception ex) {
		return false;
		}
	}
	@Override
	public List<Submodel> Viewallsub(Submodel m) {
		List<Submodel> list=template.query("select * from subject where status=0",new RowMapper<Submodel>() {

			@Override
			public Submodel mapRow(ResultSet rs, int rowNum) throws SQLException {
				Submodel mo=new Submodel();
				mo.setId(rs.getInt(1));
				mo.setName(rs.getString(2));
				return mo;
			}
			
		});
		return list.size()>0?list:null;
	}
	
}
