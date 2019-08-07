package com.xiaozhang.busmis.sercurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xiaozhang.busmis.security.model.UserModel;
import com.xiaozhang.busmis.security.service.IUserService;
@Controller
@RequestMapping("/user")
public class UserContrallor {
	
	@Autowired
	IUserService us = null;

	@RequestMapping("/tolist")
	public String tolist(Model model)  throws Exception{
		List<UserModel> list = us.getListByAll();
		model.addAttribute("userList", list);
		return "/user/list";
		
	}
	@RequestMapping("/toregister")
	public String toregister()  throws Exception{
		return "/user/register";
		
	}
}
