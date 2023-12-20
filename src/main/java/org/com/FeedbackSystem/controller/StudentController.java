//package org.com.FeedbackSystem.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//import org.com.FeedbackSystem.Repository.StudeRepo;
//import org.com.FeedbackSystem.Repository.StudentRepos;
//import org.com.FeedbackSystem.Service.StudentSer;
//import org.com.FeedbackSystem.Service.StudentService;
//import org.com.FeedbackSystem.Service.TrainerServ;
//import org.com.FeedbackSystem.model.Student;
//import org.com.FeedbackSystem.model.Trainer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//public class StudentController 
//{ 
//
//	//@Autowired 
//	//StudentService repo;
//	@Autowired
//	StudentSer stu;
//	
//	@RequestMapping(value="/Std")
//	public String getRegisterPage()
//	{
//		return "StudentRegistion";
//	}
//	
//	@RequestMapping(value="/Add",method=RequestMethod.GET)
//	public String AddQualification(Student s) {
//		boolean b=stu.AddQual(s);
//		System.out.println("hhhhhiiiii");
//		return "StudentRegistration";
//	}
////	@Autowired
////	TrainerServ Trianer1;
//	
//	@RequestMapping(value = "/addS")
//	public String AddStudent() {
//		return "NewStudent";
//	}
//	@RequestMapping(value="/S",method=RequestMethod.GET)
//	public String AddTrainer()
//	{
//		return "NewStudent";
//	}
//	
//
//	
//	@RequestMapping(value = "/addneawStudent", method = RequestMethod.GET)
//	public String AddStudent(Student t, Map m) {
//
//			boolean b = stu.AddStudent(t);
//			if (b) {
//				m.put("msg", "Student Added Sucess.......");
//				return "AddStudent";
//			} else {
//				m.put("msg", "Student are arleady Exist......");
//				return "AddStudent";//Error
//			}
//	} 
//
//	@RequestMapping(value = "/chacksStudent", method = RequestMethod.GET)
//	@ResponseBody
//	public String chackTrainer(@RequestParam("Tname") String name) {
//		boolean b=stu.IsAvailableStudent(name);
//		if(b)
//		{
//			return "Student Alredy Exist...";
//		}
//		else {
//			return "";
//		}
//	}    
//
//	@RequestMapping(value = "/viewStud")
//	public String viewTrainer(Trainer s, Map m) {
//		List<Student> list = new ArrayList();
//		list = stu.viewStudent();
//		m.put("Subjects", list);
//		return "ViewTrainer";
//	}
//
//	@RequestMapping(value = "/updateT", method = RequestMethod.GET)
//	public String updateTrainer(@RequestParam("id") int sid, @RequestParam("Name") String name, Map m) {
//		m.put("id", sid);
//		m.put("n", name);
//		return "UpdateTrainer";
//	}
//
//	@RequestMapping(value = "/updT", method = RequestMethod.GET)
//	public String updateTrainer(Student t, Map m) {
//		boolean b = stu.updateStudent(t);
//		if (b) {
//			return "redirect:viewsub";
//		} else {
//			m.put("msg", "Student Already Exist.......");
//			return "updateTrainer";
//		}
//	}
//
//	@RequestMapping(value = "/disableT", method = RequestMethod.GET)
//	public String DisableStudent(Student model, Map m) {
//		boolean b = stu.DisableStudent(model);
//		if (b) {
//			return "redirect:viewStudent";
//		} else {
//			m.put("msg", "Some Problem is There....");
//			return "AdminDashBoard";
//		}
//
//	} 
//
//	@RequestMapping(value = "ENST")
//	public String EnableTrainer(Student m,Map mp) 
//	{
//		boolean list=stu.EnableStudent(m);
//		mp.put("Student", list);
//		return "ViweStudent";
//	}
//
//	@RequestMapping(value = "/serT")
//	@ResponseBody
//	public String searchStudent(@RequestParam("subname")String name) {
//		List<Student> list = stu.searchStudent(name);
//		String table="<table><tr><th>ID</th><th>Student Name</th><th>Update</th><th>Disable</th</tr>";
//		
//		for(Student mod:list)
//		{
//		table=table+"<tr><td>"+mod.getStid()+"</td><td>"+mod.getSubname()+"</td><td><a href=''>Update</a></td><td><a href=''>Disable</a></td></tr>";
//		}
//		table=table+"</table>";
//		return table;
//	}
//}
