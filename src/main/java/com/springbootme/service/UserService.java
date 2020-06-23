package com.springbootme.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootme.domain.User;
import com.springbootme.repository.UserRepositoryJustin;

@Service
public class UserService {

	@Autowired
	private UserRepositoryJustin userRepository;

	public List<User> findAll() {

		var it = userRepository.findAll();

		var users = new ArrayList<User>();
		it.forEach(e -> users.add(e));

		return users;
	}

	public Long count() {

		return userRepository.count();
	}

	public void deleteById(Long userId) {

		userRepository.deleteById(userId);
	}
}