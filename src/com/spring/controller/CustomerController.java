package com.spring.controller;

import java.util.List;

import javax.jws.WebParam.Mode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.dao.CustomerDAO;
import com.spring.entity.Customer;
import com.spring.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/list")
	public Model listCustomers(Model m) {
		List<Customer> customers = customerService.getCustomer();
		m.addAttribute("customers", customers);
		return m;

	}

	@RequestMapping("/showAddForm")
	public String showAddForm(Model m) {
		Customer theCustomer = new Customer();

		m.addAttribute("customer", theCustomer);
		return "showAddForm";
	}

	@RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("customer") Customer myCustomer) {
		customerService.saveCustomer(myCustomer);
		return "redirect:/customer/list";
	}

	@RequestMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("customerId") int id, Model m) {
		Customer theCustomer = customerService.getCustomer(id);

		m.addAttribute("customer", theCustomer);

		return "showAddForm";
	}

	@RequestMapping("/deleteCustomer")
	public String deleteCustomer(@RequestParam("customerId") int id, Model m) {
		customerService.deleteCustomer(id);
		return "redirect:/customer/list";
	}
}
