package com.carservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_carservice")
public class Carservice {
	
	@Id
	@Column(name = "service_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long serviceId;
	
	@Column(name = "car_model")
	private String carName;
	
	@Column(name = "available_service")
	private String availableService;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "user_id", nullable = false)
	private User userService;
	
	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	public String getAvailableService() {
		return availableService;
	}

	public void setAvailableService(String availableService) {
		this.availableService = availableService;
	}

	public User getUserService() {
		return userService;
	}

	public void setUserService(User userService) {
		this.userService = userService;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}
		

}
