package com.excelr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.excelr.model.Address;

@Controller
public class MyController {

	@RequestMapping(value={"/","/hello","/index"})
	public String getPlayer(Model model)
	{
		String myCourseName="Full Stack Developer";
		model.addAttribute("testabc",myCourseName);
		return "virat";
	}
	
	@RequestMapping("/coach")
	public String getCoach(ModelMap modelmap)
	{
		modelmap.addAttribute("location" , "Baner");
		modelmap.addAttribute("city" , "Pune");
		modelmap.addAttribute("State" , "Mh");
		return "ghambhir";
	}
	
	@RequestMapping("/owner")
	public String getOwner(Model model)
	{
		Address a1=new Address("Viman Nagar", "Mumbai", "Mh");
		model.addAttribute("abc", a1);
		return "srk";
	}
	
}
