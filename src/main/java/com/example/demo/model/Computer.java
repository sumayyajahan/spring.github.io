package com.example.demo.model;

import jakarta.annotation.PreDestroy;

public class Computer {
	
	private String name;
	private Coder coder;

	public Computer() {
		super();
		System.out.println("No - arg constructor called (Computer class)");
	}

	public Computer(String name, Coder coder) {
		super();
		this.name = name;
		this.coder = coder;
		System.out.println("All - arg constructor called (Computer class)");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Coder getCoder() {
		return coder;
	}

	public void setCoder(Coder coder) {
		this.coder = coder;
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Computer object destroy");
	}
	

}
