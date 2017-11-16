package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignupController {
	@RequestMapping("/signupForm.do")
	public String signupForm() {
		return "signup_form";
	}
}
