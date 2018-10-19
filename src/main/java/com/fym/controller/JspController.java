package com.fym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fym.dao.UserDao;
import com.fym.mapper.Daily;

@Controller
@RequestMapping("/index")
public class JspController {
	
	@Autowired UserDao userdao;
	@Autowired Daily daiLy;
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/user")
	public String user(ModelMap map) {
		map.put("user", userdao.selectAll());
		return "user";
	}
	
	@RequestMapping("/user_m")
	public String userM(ModelMap map) {
		map.put("user", daiLy.selectAll());
		return "user";
	}
}
