package com.luxkapotter.todoapp.DTOs;

import jakarta.validation.constraints.NotBlank;

public class TodoDTO {
	
	@NotBlank
	private String content;
	
	public TodoDTO() {
		
	}

	public TodoDTO(String content) {
		super();
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
