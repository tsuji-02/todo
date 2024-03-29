package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Todo;

@Repository
public interface TodoRepository  extends JpaRepository<Todo, String>{
	List<Todo> findByUseridIs(String userid);
}
