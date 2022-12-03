package com.luxkapotter.todoapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luxkapotter.todoapp.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
