package com.carservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.carservice.model.Carservice;
import com.carservice.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query("select t from t_user t where t.user_name=:user")
	public List<Carservice> findAllCarServiceByUser(@Param("user") String user);
}
