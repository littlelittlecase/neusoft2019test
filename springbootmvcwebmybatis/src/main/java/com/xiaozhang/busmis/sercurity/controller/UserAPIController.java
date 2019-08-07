package com.xiaozhang.busmis.sercurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xiaozhang.busmis.security.model.UserModel;
import com.xiaozhang.busmis.security.service.IUserService;

@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class UserAPIController {

	@Autowired
	private IUserService us = null;
	@RequestMapping("/get")
	public UserModel getUser(String userid) throws Exception{
		
		return us.getById(userid);
	}
	
	@RequestMapping("/list")
	public List<UserModel> getuserlist() throws Exception{
		return us.getListByAll();
		
	}
	
}
