package com.spring.jpa.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jpa.dao.SpringJpaDao;
import com.spring.jpa.model.UserDetails;

@Service
public class SpringJpaService {

	@Autowired
	SpringJpaDao springJpaDao;
	
	public UserDetails insertUserDetail(UserDetails userDetails) {
		return springJpaDao.save(userDetails);
	}
	
	public Optional<UserDetails> getUserDetail(int id) {
		return springJpaDao.findById(id);
	}
	
	public Iterable<UserDetails> getUsersDetail() {
		return springJpaDao.findAll();
	}
	
	public UserDetails updateUserDetail(UserDetails userDetails) {
		return springJpaDao.save(userDetails);
	}
	
	public void deleteUserDetail(int id) {
		springJpaDao.deleteById(id);
	}
}
