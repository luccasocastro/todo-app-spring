package com.luxkapotter.todoapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luxkapotter.todoapp.DTOs.UserDTO;
import com.luxkapotter.todoapp.entities.User;
import com.luxkapotter.todoapp.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public Optional<User> findById(Long id) {
		return repository.findById(id);
	}
	
	public User insert(UserDTO obj) {
		User user = new User();
		user.setUsername(obj.getUsername());
		user.setPassword(obj.getPassword());
		return repository.save(user);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
}
