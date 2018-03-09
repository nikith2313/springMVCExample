package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import springmvc.Entity.Customer;
import springmvc.Entity.Login;
import springmvc.Service.customerOperations;

@Controller
public class UserController {

	@Autowired
	private customerOperations eo;
	
	
	@RequestMapping(value="login",method = RequestMethod.GET)
	public String home(ModelMap model){
		model.addAttribute("customer",new Customer());
		System.out.println("controller called");
		return "registration";
	}
	@RequestMapping(value = "lo")
	public ModelAndView user() {
		ModelAndView mv = new ModelAndView("login", "login", new Login());
		return mv;
	}
	
	
	@RequestMapping(value="registration",method = RequestMethod.POST)
	public String registration(@ModelAttribute Customer cust,ModelMap model){
		eo.addCustomer(cust);
		model.addAttribute("customer", cust);
		return "redirect:lo";
	}

	@RequestMapping(value="loginpage",method = RequestMethod.GET)
	public String loginpage(ModelMap model){
		model.addAttribute("customer",new Customer());
		System.out.println("controller called");
		return "home";
	}
	@RequestMapping(value="auth")
	public String authentication(@ModelAttribute Login login,ModelMap model){
		System.out.println(login.getUserName());
		boolean cust=eo.getCustomer(login.getUserName(),login.getPassword());
		if(cust==true)
		model.addAttribute("customer", cust);
		else
			model.addAttribute("customer", new Customer());
		return "index";
	}
}
