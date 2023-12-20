package org.com.FeedbackSystem.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.com.FeedbackSystem.Service.AdminServ;
import org.com.FeedbackSystem.model.admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@Autowired
	AdminServ serv;
	@RequestMapping(value="/hgk")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("MainF");
	}
//	@RequestMapping(value = "/admin")
//	public String admin() {
//		return "AddNewSubject";
//	}
	@RequestMapping(value = "/Student")
	public String Student() {
		return "AddNewSubject";
	}
	
	@RequestMapping(value = "/admin1")
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "/admin")
	public String admin() {
		return "AdminDashBoard";
	}
	
	@RequestMapping(value="/log",method=RequestMethod.GET)
	public String AdminLogin(admin a,Map map)
	{
		List<admin> list=serv.chackAdmin(a);
		if(list.size()>0)
		{
			map.put("data",list);
		return "AdminDashBoard";
		}
		else
		{
			map.put("msg","Invalid Usernme And Password");
		return "Error";}
	}
	
	
//	@RequestMapping(value="/Slog",method=RequestMethod.GET)
//	public String StudentLogin(org.com.FeedbackSystem.model.Student a,Map map)
//	{
//		List<Student> list=serv.chackStudent(a);
//		if(list.size()>0)
//		{
//			map.put("data",list);
//		return "Student";
//		}
//		else
//		{
//			map.put("msg","Invalid Usernme And Password");
//	  map.put("msg","Invalid Student");
//		return "Error";}
//	}

	
	
}
