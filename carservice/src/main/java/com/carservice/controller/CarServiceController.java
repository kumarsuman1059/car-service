package com.carservice.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carservice.model.Carservice;
import com.carservice.model.User;
import com.carservice.service.CarServiceRecordService;

@RestController(value = "/api/carService/")
public class CarServiceController {

	@Autowired
	CarServiceRecordService carServiceRecordService;

	@GetMapping(value = "/getAllUsers")
	public ResponseEntity<List<User>> getAllUsers() {
		return new ResponseEntity<List<User>>(carServiceRecordService.getAllUserList(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/getAvailableCarService/{user}")
	public ResponseEntity<List<Carservice>> getAvailableCarServiceByUser(@PathParam(value = "user") final String user) {
		return new ResponseEntity<List<Carservice>>(carServiceRecordService.findAllCarServiceByUser(user), HttpStatus.OK);
	} 
	
	@GetMapping(value = "/getAvailableCarService/{car}")
	public ResponseEntity<List<Carservice>> getAvailableCarServiceByCar(@PathParam(value = "car") final String car) {
		return new ResponseEntity<List<Carservice>>(carServiceRecordService.findAllCarServiceByCar(car), HttpStatus.OK);
	} 
	
	@PostMapping(value = "/getAllUsers",consumes = "application/json", produces = "application/json")
	public void recordCarService(@RequestBody User user) {
		carServiceRecordService.recordCarService(user);
	} 
	
	
}
