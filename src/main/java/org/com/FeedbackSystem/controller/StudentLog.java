package org.com.FeedbackSystem.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.com.FeedbackSystem.Service.AdminServ;
import org.com.FeedbackSystem.Service.StudentSer;
import org.com.FeedbackSystem.model.Student;
import org.com.FeedbackSystem.model.admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

 @Controller
public class StudentLog 
{
	@Autowired
	StudentSer stu;
	@RequestMapping(value="/Stul")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("StuL");
	}
	@RequestMapping(value="/logS",method=RequestMethod.GET)
	public String StudentLogin(Student a,Map map)
	{
		List<Student> list=stu.chackStudent(a);
		if(list.size()>0)
		{
			map.put("data",list);
		return "StudentRegistration";
		}
		else
		{
			map.put("msg","Invalid Usernme And Password");
		return "Error";}
	}
	
}
