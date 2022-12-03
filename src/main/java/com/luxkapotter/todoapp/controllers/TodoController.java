package com.luxkapotter.todoapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luxkapotter.todoapp.DTOs.TodoDTO;
import com.luxkapotter.todoapp.entities.Todo;
import com.luxkapotter.todoapp.services.TodoService;

@RestController
@RequestMapping(value="/todos")
public class TodoController {
	
	@Autowired
	private TodoService service;
	
	@GetMapping
	public ResponseEntity<List<Todo>> findAll(){
		List<Todo> list = service.findAll();
		return new ResponseEntity<List<Todo>>(list, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id){
		Optional<Todo> obj = service.findById(id);
		return new ResponseEntity<Optional<Todo>>(obj, HttpStatus.OK);
	}
	
	@PostMapping("/{userId}")
	public HttpStatus insert(@PathVariable Long userId, @RequestBody TodoDTO obj) {
		service.insert(userId, obj);
		return HttpStatus.CREATED;
	}
}
