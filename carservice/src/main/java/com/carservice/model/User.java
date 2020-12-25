package com.carservice.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_applicationuser")
public class User {

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;

	@Column(name = "user_name")
	private String name;

	@OneToMany(mappedBy = "applicationuser", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Car> car;
	
	@OneToMany(mappedBy = "userService", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Carservice> carservice;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Car> getCar() {
		return car;
	}

	public void setCar(List<Car> car) {
		this.car = car;
	}

	public List<Carservice> getCarservice() {
		return carservice;
	}

	public void setCarservice(List<Carservice> carservice) {
		this.carservice = carservice;
	}
	

}
