package me.niloybiswas.customer.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping("/newCustomer")
	public String newCustomerForm(Map<String, Object> model) {
		model.put("customer", new Customer());
		return "newCustomer";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		service.save(customer);
		return "redirect:/";
	}

}
