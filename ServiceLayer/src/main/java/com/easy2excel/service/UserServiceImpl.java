package com.easy2excel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easy2excel.entity.User;
import com.easy2excel.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepo;

	@Override
	public User saveUser(User user) {

		User newuser = new User();
		newuser.setEmail(user.getEmail());
		newuser.setName(user.getName());
		User user1 = userRepo.save(newuser);
		return user1;
	}

}
