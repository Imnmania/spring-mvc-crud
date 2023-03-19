package me.niloybiswas.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import me.niloybiswas.customer.model.Customer;
import me.niloybiswas.customer.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("index");
		List<Customer> customerList = service.listAll();
		mav.addObject("customerList", customerList);
		return mav;
	}

}
