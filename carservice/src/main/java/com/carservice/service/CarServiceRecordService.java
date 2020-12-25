package com.carservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.carservice.model.Carservice;
import com.carservice.model.User;

@Service
public interface CarServiceRecordService {

	List<User> getAllUserList();
	
	List<Carservice> findAllCarServiceByUser(String user);
	
	List<Carservice> findAllCarServiceByCar(String car);

}
