package net.slipp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WelcomeController {
	@GetMapping("/helloworld")
	public String Welcome(Model model) {
		//System.out.println("name : "+ name);
		model.addAttribute("name", "한길우");
		model.addAttribute("value", 4000000);
		model.addAttribute("taxed_value",400000*0.67 );
		return "welcome";
	}
}
