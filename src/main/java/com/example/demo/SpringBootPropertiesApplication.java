package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPropertiesApplication implements CommandLineRunner {
//	@Value("${myapp.language}")
//	String lang;
	
	@Autowired
	MyProperties myprop;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootPropertiesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("language is : " + myprop.getMyapp().getLanguage() + "name is : " + myprop.getName() + "ZIP CODE IS : " + myprop.getZip()[0]);
		
	}

}
