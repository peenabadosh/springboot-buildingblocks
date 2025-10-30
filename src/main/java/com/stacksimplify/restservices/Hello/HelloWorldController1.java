package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController1 {

	// SimpleMethod
	// URI - /helloWorld
	// GET -

	@RequestMapping(method = RequestMethod.GET, path = "/helloWorld")

	public String helloworld() {
		return "Hello World";
	}
	
@GetMapping("/helloworld-bean")
	public UserDetails helloWorldBean()
	{
		return new UserDetails("Richa", "Sharma", "Noida");
	}
}
