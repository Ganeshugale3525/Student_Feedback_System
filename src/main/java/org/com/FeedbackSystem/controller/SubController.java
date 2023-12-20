package org.com.FeedbackSystem.controller;

import java.util.*;
import java.util.Map;

import org.com.FeedbackSystem.Service.SubService;
import org.com.FeedbackSystem.model.Submodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SubController {
	@Autowired
	SubService subServ;

	@RequestMapping(value = "/addsub")
	public String addsub() {
		return "AddNewSubject";
	}

	@RequestMapping(value = "/addnewsub", method = RequestMethod.GET)
	public String AddNewSub(Submodel sub, Map m) {

			boolean b = subServ.AddSubject(sub);
			if (b) {
				m.put("msg", "Subject Added Sucess.......");
				return "AddNewSubject";
			} else {
				m.put("msg", "Subject Already Exist......");
				return "AddNewSubject";//Error
			}
	} 

	@RequestMapping(value = "/chacks", method = RequestMethod.GET)
	@ResponseBody
	public String chacksubjects(@RequestParam("subname") String name) {
		boolean b=subServ.IsAvailableSub(name);
		if(b)
		{
			return "Subject Alredy Exist...";
		}
		else {
			return "";
		}
	}    

	@RequestMapping(value = "/viewsub")
	public String viewSub(Submodel s, Map m) {
		List<Submodel> list = new ArrayList();
		list = subServ.viewSub(s);
		m.put("Subjects", list);
		return "ViewSub";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String UpdateSub(@RequestParam("id") int sid, @RequestParam("Name") String name, Map m) {
		m.put("id", sid);
		m.put("n", name);
		return "UpdateSubject";
	}

	@RequestMapping(value = "/upd", method = RequestMethod.GET)
	public String UpdateS(Submodel s, Map m) {
		boolean b = subServ.updSub(s);
		if (b) {
			return "redirect:viewsub";
		} else {
			m.put("msg", "Subject Already Exist.......");
			return "UpdateSubject";
		}
	}

	@RequestMapping(value = "/disable", method = RequestMethod.GET)
	public String disableSub(Submodel model, Map m) {
		boolean b = subServ.Disablesub(model);
		if (b) {
			return "redirect:viewsub";
		} else {
			m.put("msg", "Some Problem is There....");
			return "AdminDashBoard";
		}

	} 

	@RequestMapping(value = "ENS")
	public String EnableSubject(Submodel m,Map mp) 
	{
		List<Submodel> list=subServ.viewallsub(m);
		mp.put("Subjects", list);
		return "ViewSub";
	}

	@RequestMapping(value = "/ser")
	@ResponseBody
	public String SearchSub(@RequestParam("subname")String name) {
		List<Submodel> list = subServ.Search(name);
		String table="<table><tr><th>ID</th><th>Subject Name</th><th>Update</th><th>Disable</th</tr>";
		
		for(Submodel mod:list)
		{
		table=table+"<tr><td>"+mod.getId()+"</td><td>"+mod.getName()+"</td><td><a href=''>Update</a></td><td><a href=''>Disable</a></td></tr>";
		}
		table=table+"</table>";
		return table;
	}
}
