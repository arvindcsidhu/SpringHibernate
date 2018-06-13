package com.luv2code.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;
import com.mysql.fabric.xmlrpc.base.Value;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		
		theModel.addAttribute("customers", customerService.getCustomers());
		
		return "list-customers";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		Customer customer = new Customer();
		theModel.addAttribute("customer",customer);
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@Validated @ModelAttribute("customer") Customer customer) {
	
		customerService.saveCustomer(customer);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int Id, Model theModel) {
		
		Customer customer = customerService.getCustomer(Id);
		
		theModel.addAttribute("customer",customer);
		
		return "customer-form";
	}
	
	@GetMapping("/delete")
	public String showFormForDelete(@RequestParam("customerId") int Id) {
		
		customerService.deleteCustomer(Id);
		
		return "redirect:/customer/list";
	}

}
