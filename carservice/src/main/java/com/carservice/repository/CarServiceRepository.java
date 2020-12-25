package com.carservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.carservice.model.Carservice;


@Repository
public interface CarServiceRepository extends JpaRepository<Carservice, Long>{

	@Query("select t from t_carservice t where t.car_model=:car")
	List<Carservice> findAllCarServiceByCar(@Param("car") String car);

}
