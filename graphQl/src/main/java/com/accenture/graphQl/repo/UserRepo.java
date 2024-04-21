package com.accenture.graphQl.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accenture.graphQl.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
