package org.com.FeedbackSystem.controller;

import org.com.FeedbackSystem.Service.QualService;
import org.com.FeedbackSystem.model.Qualification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class QualificationController {
	@Autowired 
	QualService serv;
	
	@RequestMapping(value="/abc",method=RequestMethod.GET)
	public String AddQualification(Qualification q) {
		boolean b=serv.AddQual(q);
		System.out.println("hhhhhiiiii");
		return null;
	}
	

}
