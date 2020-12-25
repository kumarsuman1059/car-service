package com.carservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.carservice.model.Carservice;
import com.carservice.model.User;
import com.carservice.repository.CarServiceRepository;
import com.carservice.repository.UserRepository;

@Component
public class CarServiceRecordServiceImpl implements CarServiceRecordService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	CarServiceRepository carServiceRepository;

	public List<User> getAllUserList() {
		return userRepository.findAll();
	}

	public List<Carservice> findAllCarServiceByUser(String user) {
		return userRepository.findAllCarServiceByUser(user);
	}

	@Override
	public List<Carservice> findAllCarServiceByCar(String car) {
		return carServiceRepository.findAllCarServiceByCar(car);
	}

	@Override
	public void recordCarService(User user) {
		userRepository.save(user);		
	}



}
