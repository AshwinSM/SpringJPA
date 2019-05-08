package com.spring.jpa.dao;

import org.springframework.stereotype.Repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.jpa.model.UserDetails;

@Repository
public interface SpringJpaDao extends CrudRepository<UserDetails,Integer>{

}
