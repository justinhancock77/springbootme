package com.springbootme.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootme.domain.User;

@Repository
public interface UserRepositoryJustin extends CrudRepository<User, Long> {
	
	Optional<User> findByEmail(String email);

    Boolean existsByEmail(String email);
    
    Optional<com.springbootme.domain.User> findById(UUID id);

}
