package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;


import com.example.demo.model.Coder;

@SpringBootApplication

public class First1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(First1Application.class, args);
		
		Coder coder =  context.getBean(Coder.class);
		coder.name2 = "Rahman";
		System.out.println(coder.name2);

		Coder c2 = context.getBean(Coder.class);
		c2.name2 = "Mahmud";
		System.out.println(c2.name2);

		//coder.petInfo();

//		System.out.println(coder.getName());
//		System.out.println(coder.getComputer().getName());
	}

}
