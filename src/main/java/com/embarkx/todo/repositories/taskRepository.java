package com.embarkx.todo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.embarkx.todo.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
