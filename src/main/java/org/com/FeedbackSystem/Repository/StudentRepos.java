package org.com.FeedbackSystem.Repository;

import java.util.List;

import org.com.FeedbackSystem.model.Student;
import org.com.FeedbackSystem.model.Trainer;

public interface StudentRepos 
{
	public boolean AddQual(Student s);
	public boolean AddStudent(Student Adds);
//	public boolean AddQual(Student s);
	List<Student> viewStudent(Student m);
	public boolean updateStudent(Student m);
	public boolean DisableStudent(Student m);
	//public List<Trainer> SearcTrainer(String m);
	public boolean EnableStudent(Student m);
	public boolean IsAvailableStudent(String Stud);
	public List<Student> ViewallStudent(Student m);
	//public List<Trainer> SearchTrainer(String m);
	public List<Student> searchStudent(String m);
	public List<Student> viewStudent();
	//public boolean updSub(Submodel s);



}
