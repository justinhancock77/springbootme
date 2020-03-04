package com.springbootme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootme.domain.User;
import com.springbootme.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class HelloController {
	
	@Autowired
	UserRepository uRepo;
	
	@RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
	
	@RequestMapping("/users")
	public Iterable<User> greeting() {
		return uRepo.findAll();
	}

}
