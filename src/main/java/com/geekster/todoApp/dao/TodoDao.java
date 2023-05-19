package com.geekster.todoApp.dao;

import com.geekster.todoApp.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoDao {
    private List<Todo> todoList;

    public TodoDao(){
        todoList = new ArrayList<>();
        todoList.add(new Todo(0,"Sample Todo 0","true","18"));
    }

    public List<Todo> getTodos(){
        return todoList;
    }

    public List<Todo> getAllTodos(String lastDate, String status){
        List<Todo> filteredList = new ArrayList<>();

        if(lastDate == null && status == null){
            return todoList;
        } else if (lastDate != null && status != null) {

            for(Todo todoObj : todoList){
                if(todoObj.getLastDate().equals(lastDate) && todoObj.getTodoStatus().equals(status)){
                    filteredList.add(todoObj);
                }
            }

        } else if(lastDate != null){

            for(Todo todoObj : todoList){
                if(todoObj.getLastDate().equals(lastDate)){
                    filteredList.add(todoObj);
                }
            }
        }
        else if(status != null){
            for(Todo todoObj : todoList){
                if(todoObj.getTodoStatus().equals(status)){
                    filteredList.add(todoObj);
                }
            }
        }
        return filteredList;
    }

    public void addTodo(Todo todo){
        todoList.add(todo);
    }
}
