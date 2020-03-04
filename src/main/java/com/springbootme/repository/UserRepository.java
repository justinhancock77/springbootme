package com.springbootme.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootme.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
