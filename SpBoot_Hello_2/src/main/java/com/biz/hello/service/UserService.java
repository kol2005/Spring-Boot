package com.biz.hello.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.biz.hello.domain.UserVO;

@Service
public class UserService {

	public List<UserVO> getUserList() {
		List<UserVO> userList = new ArrayList<>();
		userList.add(UserVO.builder()
				.username("홍길동")
				.password("1234")
				.email("asdf@naver.com")
				.phone("010-1111-1111")
				.address("서울")
				.build());
		
		userList.add(UserVO.builder()
				.username("이몽룡")
				.password("1234")
				.email("asdf@naver.com")
				.phone("010-1111-1111")
				.address("서울")
				.build());
		
		userList.add(UserVO.builder()
				.username("성춘향")
				.password("1234")
				.email("asdf@naver.com")
				.phone("010-1111-1111")
				.address("서울")
				.build());

		return userList;
	}

}
