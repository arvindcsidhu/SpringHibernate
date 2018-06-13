package com.springmvc.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/helloworld")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/letsprocessForm")
	public String letsProcess(HttpServletRequest request,Model model) {
		
		String name = String.valueOf(request.getParameter("studentName"));
		
		name = name.toUpperCase();
		
		model.addAttribute("message", name);
		
		return "helloworld";
	}
	
	@RequestMapping("/letsprocessForm1")
	public String letsprocessForm(@RequestParam("studentName") String name,Model model) {
		
		//String name = String.valueOf(request.getParameter("studentName"));
		
		name = name.toUpperCase();
		
		model.addAttribute("message", name);
		
		return "helloworld";
	}

}
