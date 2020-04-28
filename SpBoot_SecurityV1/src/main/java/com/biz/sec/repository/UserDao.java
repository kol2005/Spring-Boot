package com.biz.sec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biz.sec.domain.UserVO;

public interface UserDao extends JpaRepository<UserVO, Long>{
	
	public UserVO findByUsername(String username);
	

}
