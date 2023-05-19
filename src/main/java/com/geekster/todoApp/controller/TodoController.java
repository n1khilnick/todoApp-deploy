package com.geekster.todoApp.controller;

import com.geekster.todoApp.model.Todo;
import com.geekster.todoApp.service.TodoService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    TodoService todoService;

    @PostMapping(value = "/todos")
    public String addTodo(@RequestBody Todo task){
        todoService.addTodo(task);
        return "Task Saved !";
    }

    @GetMapping(value = "/todos")
    public List<Todo> getAllTodos(@Nullable @RequestParam String lastDate,@Nullable @RequestParam String status){
        return todoService.getAllTodos(lastDate,status);
    }
}
