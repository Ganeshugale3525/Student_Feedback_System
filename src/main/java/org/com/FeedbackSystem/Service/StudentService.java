package org.com.FeedbackSystem.Service;

import java.util.List;

import org.com.FeedbackSystem.model.Student;
import org.com.FeedbackSystem.model.Trainer;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
@Service
@Configuration
public interface StudentService 
{
	public boolean AddQual(Student s);
	public boolean AddStudent(Student Adds);
	List<Student> viewStudent(Student m);
	public boolean updateStudent(Student m);
	public boolean DisableStudent(Student m);
	//public List<Trainer> SearcTrainer(String m);
	public boolean EnableStudent(Trainer m);
	public boolean IsAvailableStudent(String Stud);
	public List<Student> ViewallStudent(Student m);
	//public List<Trainer> SearchTrainer(String m);
	public List<Student> searchStudent(String m);
	public List<Student> viewStudent();
	//public boolean updSub(Submodel s);
	boolean EnableStudent(Student m);

}
