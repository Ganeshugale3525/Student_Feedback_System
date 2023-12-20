package org.com.FeedbackSystem.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.com.FeedbackSystem.Service.AdminServ;
import org.com.FeedbackSystem.Service.SubService;
import org.com.FeedbackSystem.Service.TrainerServ;
import org.com.FeedbackSystem.Service.TrainerService;
import org.com.FeedbackSystem.model.Submodel;
import org.com.FeedbackSystem.model.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TrainerController {
	
	@Autowired
	TrainerServ Trianer1;
	
	@RequestMapping(value = "/add")
	public String AddNewTrainer() {
		return "NewTrainer";
	}
	@RequestMapping(value="/T",method=RequestMethod.GET)
	public String AddTrainer()
	{
		return "NewTrainer";
	}
	

	
	@RequestMapping(value = "/addneawTrainer", method = RequestMethod.GET)
	public String AddTrainer(Trainer t, Map m) {

			boolean b = Trianer1.AddTrainer(t);
			if (b) {
				m.put("msg", "Trainer Added Sucess.......");
				return "AddTrainer";
			} else {
				m.put("msg", "Trainer Already Exist......");
				return "AddTrainer";//Error
			}
	} 

	@RequestMapping(value = "/chacksTrainer", method = RequestMethod.GET)
	@ResponseBody
	public String chackTrainer(@RequestParam("Tname") String name) {
		boolean b=Trianer1.IsAvailableTrainer(name);
		if(b)
		{
			return "Trainer Alredy Exist...";
		}
		else {
			return "";
		}
	}    

	@RequestMapping(value = "/viewTrainer")
	public String viewTrainer(Trainer s, Map m) {
		List<Trainer> list = new ArrayList();
		list = Trianer1.viewTrainer();
		m.put("Subjects", list);
		return "ViewTrainer";
	}

	@RequestMapping(value = "/updateT", method = RequestMethod.GET)
	public String updateTrainer(@RequestParam("id") int sid, @RequestParam("Name") String name, Map m) {
		m.put("id", sid);
		m.put("n", name);
		return "UpdateTrainer";
	}

	@RequestMapping(value = "/updT", method = RequestMethod.GET)
	public String updateTrainer(Trainer t, Map m) {
		boolean b = Trianer1.updateTrainer(t);
		if (b) {
			return "redirect:viewsub";
		} else {
			m.put("msg", "Trainer Already Exist.......");
			return "updateTrainer";
		}
	}

	@RequestMapping(value = "/disableT", method = RequestMethod.GET)
	public String DisableTrainer(Trainer model, Map m) {
		boolean b = Trianer1.DisableTrainer(model);
		if (b) {
			return "redirect:viewTrainer";
		} else {
			m.put("msg", "Some Problem is There....");
			return "AdminDashBoard";
		}

	} 

	@RequestMapping(value = "ENST")
	public String EnableTrainer(Trainer m,Map mp) 
	{
		boolean list=Trianer1.EnableTrainer(m);
		mp.put("Trainer", list);
		return "ViewTrainer";
	}

	@RequestMapping(value = "/serT")
	@ResponseBody
	public String searchTrainer(@RequestParam("subname")String name) {
		List<Trainer> list = Trianer1.searchTrainer(name);
		String table="<table><tr><th>ID</th><th>Trainer Name</th><th>Update</th><th>Disable</th</tr>";
		
		for(Trainer mod:list)
		{
		table=table+"<tr><td>"+mod.getId()+"</td><td>"+mod.getSubname()+"</td><td><a href=''>Update</a></td><td><a href=''>Disable</a></td></tr>";
		}
		table=table+"</table>";
		return table;
	}
}

	
