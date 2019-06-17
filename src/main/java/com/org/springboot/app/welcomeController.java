package com.org.springboot.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

	//@RequestMapping(value="welcome", method = RequestMethod.GET)
	@RequestMapping("welcome")
    public String welcome() {
        System.out.println("Greetings from Spring Boot!");
        return "welcome";
    }
}
