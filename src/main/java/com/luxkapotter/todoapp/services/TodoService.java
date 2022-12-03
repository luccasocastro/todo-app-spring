package com.luxkapotter.todoapp.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luxkapotter.todoapp.DTOs.TodoDTO;
import com.luxkapotter.todoapp.entities.Todo;
import com.luxkapotter.todoapp.entities.User;
import com.luxkapotter.todoapp.repositories.TodoRepository;
import com.luxkapotter.todoapp.repositories.UserRepository;

@Service
public class TodoService {
	
	@Autowired
	private TodoRepository repository;
	
	@Autowired
	private UserRepository userRepository;
	
	public List<Todo> findAll(){
		return repository.findAll();
	}
	
	public Optional<Todo> findById(Long id) {
		return repository.findById(id);
	}
	
	public void insert(Long userId, TodoDTO obj) {
		User user = userRepository.findById(userId).orElseThrow(() -> new NoSuchElementException());
        Todo todo = new Todo();
        todo.setContent(obj.getContent());
        user.getTodos().add(todo);
        userRepository.save(user);
	}
}
