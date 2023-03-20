package me.niloybiswas.customer.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping("/new")
	public String newCustomerForm(Map<String, Object> model) {
		model.put("customer", new Customer());
		return "newCustomer";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		service.save(customer);
		return "redirect:/";
	}
	
	@RequestMapping("/edit")
	public ModelAndView editCustomerForm(@RequestParam(name = "id") long id) {
		ModelAndView mav = new ModelAndView("editCustomer");
		Customer customer = service.getCustomerById(id);
		mav.addObject("customer", customer);
		return mav;
	}
	
	@RequestMapping("/delete")
	public String deleteCustomer(@RequestParam(name = "id") long id) {
		service.deleteCustomerById(id);
		return "redirect:/";
	}
	
	@RequestMapping("/search")
	public ModelAndView searchCustomer(@RequestParam("keyword") String keyword) {
		ModelAndView mav = new ModelAndView("searchCustomer");
		List<Customer> result = service.search(keyword);
		mav.addObject("result", result);
		return mav;
	}
}
