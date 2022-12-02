package com.luxkapotter.todoapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_todos")
public class Todo {
	
	@Id
	private Long id;
	private String content;
	private Boolean completed = Boolean.FALSE;
	
	public Todo() {
		
	}

	public Todo(Long id, String content, Boolean completed) {
		super();
		this.id = id;
		this.content = content;
		this.completed = completed;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Boolean getCompleted() {
		return completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}
	
	
}
