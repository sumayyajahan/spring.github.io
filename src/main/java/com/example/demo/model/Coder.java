package com.example.demo.model;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Coder {

	public String name2;
	private int id;
	private String name;
	private String language;
	private Computer computer;
	@Autowired
	Dog dog;
	
	
	public Coder() {
		super();
	}
	
	
	public Coder(int id, String name, String language, Computer computer) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.computer = computer;
	}

    public void petInfo(){
      dog.info();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}


	public Computer getComputer() {
		return computer;
	}


	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Coder object destroy");
	}

}
