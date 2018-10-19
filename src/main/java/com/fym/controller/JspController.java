package com.fym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fym.dao.UserDao;

@Controller
@RequestMapping("/index")
public class JspController {
	
	@Autowired UserDao userdao;
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/user")
	public String user(ModelMap map) {
		map.put("user", userdao.selectAll());
		return "user";
	}
}
