package com.geekster.todoApp.service;

import com.geekster.todoApp.dao.TodoDao;
import com.geekster.todoApp.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    TodoDao todoDao;

    public List<Todo> getTodos(){
        return todoDao.getTodos();
    }

    public void addTodo(Todo todo){
         todoDao.addTodo(todo);
    }

    public List<Todo> getAllTodos(String lastDate, String status){
        return todoDao.getAllTodos(lastDate,status);
    }


}
