package com.embarkx.todo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.embarkx.todo.entities.Task;
import com.embarkx.todo.repositories.TaskRepository;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

}
