package com.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;

@RestController // @Controller + @ResponseBody 
public class SimpleController {

	// http://localhost:8080/say
	@RequestMapping(value = "/say")
	public String sayHello() {
		return "Welcome to Simple Spring boot REST API";
	}
	// http://localhost:8080/sayHtml
	@RequestMapping(value = "/sayHtml",produces = MediaType.TEXT_HTML_VALUE)
	public String sayHtml() {
		return "<a>Welcome to Simple Message</a>";
	}
	// http://localhost:8080/sayText
	@RequestMapping(value = "/sayText",produces = MediaType.TEXT_PLAIN_VALUE)
	public String sayPlainText() {
		return "<h1>Welcome to Simple Message<h1>";
	}
	// http://localhost:8080/sayXml
	@RequestMapping(value = "/sayXml",produces = MediaType.TEXT_XML_VALUE)
	public String sayXml() {
		return "<a>Welcome to Simple Message</a>";
	}
	// http://localhost:8080/empInfo
	@RequestMapping(value = "empInfo",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee() {
		Employee emp = new Employee(101, "RAvi", 12000);
		return emp;
	}
}
