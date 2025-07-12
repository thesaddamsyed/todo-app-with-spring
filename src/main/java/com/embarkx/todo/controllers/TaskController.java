package com.embarkx.todo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;

import com.embarkx.todo.entities.Task;
import com.embarkx.todo.services.TaskService;

@Controller
public class TaskController {

    public final TaskService taskService; 

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    public String getTasks(Model model) {
        List<Task> tasks = taskService.getAllTasks();
        model.
        
        return "tasks";
    }

}
