package com.stacksimplify.restservices.Hello;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController1 {
	@Autowired
	private ResourceBundleMessageSource messageSource;

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

@SuppressWarnings("deprecation")
@GetMapping("/hello-int")
public String getMessageinI18NFormat(@RequestHeader(name="Accept-Language", required = false) String locale)
{
	return messageSource.getMessage("label.hello",null,  new Locale (locale) );
}
}
