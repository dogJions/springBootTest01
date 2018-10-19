package com.fym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fym.entity.Book;
import com.fym.entity.Test01;

@Controller
@ResponseBody
public class HelloController {
	
	@Autowired
	private Book book;
	
//	@Autowired
//	private Test01 to1;
	
	@Value("${bok.name}")
	private String name;
	
	
	@RequestMapping("/hello")
	public String hello() {
		return book.getName();
	}
	
	@RequestMapping("/test")
	public String hello1() {
		return name;
	}
	
//	@RequestMapping("/test01")
//	public String test() {
//		return to1.getName();
//	}
}
