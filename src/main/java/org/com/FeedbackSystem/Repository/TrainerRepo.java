package org.com.FeedbackSystem.Repository;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.com.FeedbackSystem.model.Submodel;
import org.com.FeedbackSystem.model.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
@Repository("Trianer")
public class TrainerRepo implements TrianerRep
{
	
	//private final TrainerRepo Tr = new TrainerRepo();
	@Autowired
		JdbcTemplate template;
	private boolean list;
		@Override
		public boolean AddTrainer(final Trainer T)
		{
			try
			{
			int val=template.update("insert into Trainer (id,subname)value('0',?)",new PreparedStatementSetter() {

				@Override
				public void setValues(PreparedStatement ps) throws SQLException {
					ps.setString(1,T.getSubname());
				}
				
			});
			if(val>0)
			return true;
			
			else
			
				return false;
			}
			catch(Exception e)
			{
				return false;
			}

}

//		@Override
//		public boolean updatesub(final Trainer m) {
//			try {
//			int val=template.update("update Trainer set subname=? where id=?", new PreparedStatementSetter() {
//
//				@Override
//				public void setValues(PreparedStatement ps) throws SQLException {
//					ps.setString(1,m.getSubname());
//					ps.setInt(2,m.getId());
//				}
//			});
//			if(val>0)
//			return true;
//			else
//				return false;   }catch(Exception e) {return false;}   
//		}
//		@Override
//		public boolean Disablesub( final Trainer m) {
//			int val=template.update("update subject set status=0 where id=?",new PreparedStatementSetter() {
//
//				@Override
//				public void setValues(PreparedStatement ps) throws SQLException {
//					ps.setInt(1,m.getId());
//				}});
//			return val>0?true:false;
//		}
//		@Override
////		public List<Submodel> SearchSub( final Submodel m) {
//			List<Submodel> list=template.query("Select * from subject where status=1 and subname='"+m.getName()+"'",new RowMapper<Submodel>() {
	//
//				@Override
//				public Submodel mapRow(ResultSet rs, int rowNum) throws SQLException {
//					Submodel subm=new Submodel();
//					subm.setId(rs.getInt(1));
//					subm.setName(rs.getString(2));
//					return subm;
//				}
//			});
//			return list;   
//		}
		
//		public List<Trainer> SearcTrainer(String m)
//		{
//			List<Trainer> list=template.query("Select * from  where status=1 and subname like '"+m+"%'",new RowMapper<Submodel>() {
//
//				@Override
//				public Submodel mapRow(ResultSet rs, int rowNum) throws SQLException {
//					Trainer t=new Trainer();
//					t.setId(rs.getInt(1));
//					t.setSubname(rs.getString(2));
//					return t;
//				}
//			});
//			@Override
//			public List<Trainer> viewSub(Trainer m) {
//				
//					List<Trainer> list=template.query("Select * from subject where status=1 order by id",new RowMapper<Submodel>() {
//
//						@Override
//						public Trainer mapRow(ResultSet rs, int rowNum) throws SQLException {
//							Trainer m=new Trainer();
//							m.setId(rs.getInt(1));
//							m.setSubname(rs.getString(2));
//							return m;
//						} 
//					});
//				
//			
//			return list;
//		}
//		@Override
//		public boolean EnableSubject(Trainer m) {
//			// TODO Auto-generated method stub
//			return false;
//		}
//		}
//		@Override
//		public boolean IsAvailableSub(String sub) {
//			try {
//				String s=template.queryForObject("select subname from subject where subname='"+sub+"'",String.class);
//				return s.length()>0?true:false;
//			}catch(Exception ex) {
//			return false;
//			}
//		}
	//	}
//		@Override
//		public List<Trainer> ViewallTrainer(Trainer m) {
//			List<Trainer> list=template.query("select * from Trainer where status=0",new RowMapper<Trainer>() {
//
//				@Override
//				public Trainer mapRow(ResultSet rs, int rowNum) throws SQLException {
//					Trainer mo=new Trainer();
//					mo.setId(rs.getInt(1));
//					mo.setSubname(rs.getString(2));
//					return mo;
//				}
//				
//			});
//			return list.size()>0?list:null;
		//}

@Override
public List<Trainer> viewTrainer() {
    String sql = "SELECT * FROM Trainer WHERE status = 1 ORDER BY id"; // Replace "your_trainer_table" with the actual table name
    List<Trainer> list = template.query(sql, new RowMapper<Trainer>() {
        @Override
        public Trainer mapRow(ResultSet rs, int rowNum) throws SQLException {
            Trainer trainer = new Trainer();
            trainer.setId(rs.getInt("id")); // Assuming "id" is the name of your ID column in the database
            trainer.setSubname(rs.getString("subname")); // Assuming "subname" is the name of the subname column
            return trainer;
        }
    });
    return list;
}

		
	
	//return list;
//}

		

		

		@Override

public List<Trainer> searchTrainer(String m) 	
		{
			String sql = "SELECT * FROM Trainer WHERE status = 1 AND subname LIKE ?";
		    List<Trainer> list = template.query(sql, new Object[]{"%" + m + "%"}, new RowMapper<Trainer>() {
		        @Override
		        public Trainer mapRow(ResultSet rs, int rowNum) throws SQLException {
		            Trainer t = new Trainer();
		            t.setId(rs.getInt("id")); // Assuming "id" is the name of your ID column in the database
		            t.setSubname(rs.getString("subname")); // Assuming "subname" is the name of the subname column
		            return t;
		        }
		    });
		    return list;
		}

		@Override
		public boolean updateTrainer(final Trainer m) {
			try {
				int val=template.update("update Trainer set subname=? where id=?", new PreparedStatementSetter() {

					@Override
					public void setValues(PreparedStatement ps) throws SQLException {
						ps.setString(1,m.getSubname());
						ps.setInt(2,m.getId());
					}
				});
				if(val>0)
				return true;
				else
					return false;   }catch(Exception e) {return false;}   
			}
//			@Override

		@Override
		public boolean DisableTrainer(final Trainer m) {
			int val=template.update("update Trainer set status=0 where id=?",new PreparedStatementSetter() {

				@Override
				public void setValues(PreparedStatement ps) throws SQLException {
					ps.setInt(1,m.getId());
				}});
			return val>0?true:false;
		}
//			return false;
		//}

		@Override
		public boolean EnableTrainer(Trainer m) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean IsAvailableTrainer(String sub) {
			try {
				String s=template.queryForObject("select subname from subject where subname='"+sub+"'",String.class);
				return s.length()>0?true:false;
			}catch(Exception ex) {
			return false;
			}
		}//return false;
		

		@Override
		public List<Trainer> ViewalTrainer(Trainer m) {
			List<Trainer> list=template.query("select * from Trainer where status=0",new RowMapper<Trainer>() {

				@Override
				public Trainer mapRow(ResultSet rs, int rowNum) throws SQLException {
					Trainer mo=new Trainer();
					mo.setId(rs.getInt(1));
					mo.setSubname(rs.getString(2));
					return mo;
				}
				
			});
			return list.size()>0?list:null;			//return null;
		}
		
		}
		
		
		
		
		
	


