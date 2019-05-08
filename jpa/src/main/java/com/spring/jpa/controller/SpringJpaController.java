package com.spring.jpa.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.model.UserDetails;
import com.spring.jpa.service.SpringJpaService;

@RestController
@RequestMapping("/")
public class SpringJpaController {
	
	@Autowired
	SpringJpaService springJpaService;
	
	@RequestMapping(value = "/userDetail",method = RequestMethod.POST)
	public String insertUserDetail(@RequestBody UserDetails userDetails) {
		UserDetails userDetailsObj = springJpaService.insertUserDetail(userDetails);
		return "UserDetails added successfully and the generated ID is "+ userDetailsObj.getId();
	}
	
	@RequestMapping(value = "/userDetail",method = RequestMethod.GET)
	public @ResponseBody Optional<UserDetails> getUserDetail(@RequestParam int id) {
		return springJpaService.getUserDetail(id);
	}
	
	@RequestMapping(value = "/usersDetail",method = RequestMethod.GET)
	public @ResponseBody Iterable<UserDetails> getUsersDetail() {
		System.out.println("***************Inside Get*********************");
		return springJpaService.getUsersDetail();
	}
	
	@RequestMapping(value = "/userDetail",method = RequestMethod.PUT)
	public String getUsersDetail(@RequestBody UserDetails userDetails) {
		System.out.println("***************Inside pUT*********************");
		UserDetails userDetailsObj = springJpaService.updateUserDetail(userDetails);
		return "UserDetails for the ID :" +userDetailsObj.getId()+ " is modified";
	}
	
	@RequestMapping(value = "/userDetail",method = RequestMethod.DELETE)
	public String deleteUserDetail(@RequestParam int id) {
		System.out.println("Inside Delete");
		springJpaService.deleteUserDetail(id);
		return "Data Deleted for the id : "+id;
	}
	
	
}
