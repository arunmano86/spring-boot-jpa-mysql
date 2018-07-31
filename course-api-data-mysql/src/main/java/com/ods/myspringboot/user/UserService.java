package com.ods.myspringboot.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public List<User> getAllUsers(){
		List<User> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;
	}
	
	public User getUser(int id) {
		return userRepository.findById(id).get();
	}
	
	public void addUser( User user) {
		userRepository.save(user);
	}

	public void updateUser(User user, int id) {
		userRepository.save(user);
		
	}

	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}
}
