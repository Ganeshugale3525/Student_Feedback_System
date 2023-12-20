package org.com.FeedbackSystem.Service;

import java.util.List;

import org.com.FeedbackSystem.Repository.StudeRepo;
import org.com.FeedbackSystem.Repository.StudentRepos;
import org.com.FeedbackSystem.Repository.TrainerRepo;
//import org.com.FeedbackSystem.model.Qualification;
import org.com.FeedbackSystem.model.Student;
import org.com.FeedbackSystem.model.Trainer;
import org.com.FeedbackSystem.model.admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("stu")
public class StudentSer implements StudentService
{
	@Autowired
	StudeRepo studerepo;
	
	public boolean AddQual(Student s) {
		// TODO Auto-generated method stub
		return studerepo.AddQual(s);

}
	public List chackStudent(Student a)
	{

		return studerepo.chackStudent(a);
	}
	@Override
	public List<Student> viewStudent(Student m) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean updateStudent(Student t) {
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
	public boolean EnableStudent(Trainer m) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean AddStudent(Student Adds) {
		// TODO Auto-generated method stub
		return false;
	}
}