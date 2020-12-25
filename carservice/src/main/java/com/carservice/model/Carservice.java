package com.carservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_carservice")
public class Carservice {
	
	@Id
	@Column(name = "service_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long serviceId;
	
	@Column(name = "car_model")
	private String carModel;

	@Column(name = "car_number")
	private String carNumber;
	
	@Column(name = "available_service")
	private String availableService;

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getAvailableService() {
		return availableService;
	}

	public void setAvailableService(String availableService) {
		this.availableService = availableService;
	}
	
	
	

}
