package org.com.FeedbackSystem.Repository;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.com.FeedbackSystem.model.Qualification;
import org.com.FeedbackSystem.model.Student;
import org.com.FeedbackSystem.model.Trainer;
import org.com.FeedbackSystem.model.admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
@Repository("studerepo`")
public class StudeRepo implements StudentRepos
{
	
		@Autowired
		JdbcTemplate template;
		
		@Override
		public boolean AddQual(final Student s) 
//		int stid;
//		private String pasword;
//		private String Email;
//		private String sname;
//		private String lname;
//		private String address;
//		private String subname;
//		private String TeacherName;
		
		{
			int  val=template.update("insert into Student values('0',?,?,?,?,?,?)",new PreparedStatementSetter() {

				@Override
				public void setValues(PreparedStatement ps) throws SQLException {
					ps.setString(0,s.getPasword());//,s.getEmail(),s.getSname(),s.getLname(),s.getAddress(),s.getSubname(),s.getTeacherName());
				}
				
			});
			
			if(val>0)
				return true;
			else
			return false;
		}

		public List chackStudent(Student a) {
			// TODO Auto-generated method stub
			//public List<admin> chackAdmin(admin a) {
				List<Student> list=new ArrayList<Student>();
			RowMapper<Student> rr = new RowMapper<Student>() {

				@Override
				public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
					Student S = new Student();
					S.setStid(rs.getInt(1));
					S.setLname(rs.getString(5));
					S.setEmail(rs.getString(3));
					S.setSname(rs.getString(4));
					S.setAddress(rs.getString(6));
					S.setPasword(rs.getString(2));
					S.setSubname(rs.getString(7));
					S.setTeacherName(rs.getString(8));
					
					return S;
					
//					private int stid;
//					private String pasword;
//					private String Email;
//					private String sname;
//					private String lname;
//					private String address;
//					private String subname;
//					private String TeacherName;
//					
				}

			};
			// ResultSetExtractor r = null;
			//List<Student>; 
			list= template.query("select * from Student where email='"+a.getEmail()+"' and password='"+a.getPasword()+"'", rr);
//System.out.print("slkjkfhghgsdf");
		for(Student s:list)
		{
			System.out.println(s.getStid()+"\t"+s.getSname()+"\t"+s.getEmail());
		}
			return list;
			//return null;
		}

		@Override
		public List<Student> viewStudent(Student m) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean updateStudent(Student m) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean DisableStudent(Student m) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean EnableStudent(Student m) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean IsAvailableStudent(String Stud) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public List<Student> ViewallStudent(Student m) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> searchStudent(String m) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> viewStudent() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean AddStudent(Student Adds) {
			// TODO Auto-generated method stub
			return false;
		}

}