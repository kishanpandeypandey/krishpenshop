package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entitys.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{

	
	@Query("SELECT u FROM Users u WHERE u.useremail =:email")
    public Users getUserByEmail(@Param("email") String email); 
	
}
