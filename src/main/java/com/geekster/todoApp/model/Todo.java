package com.geekster.todoApp.model;

public class Todo {
    private int id;
    private String todoTitle;
    private String todoStatus;
    private String lastDate;

    public Todo(int id, String todoTitle, String todoStatus, String lastDate) {
        this.id = id;
        this.todoTitle = todoTitle;
        this.todoStatus = todoStatus;
        this.lastDate = lastDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTodoTitle() {
        return todoTitle;
    }

    public void setTodoTitle(String todoTitle) {
        this.todoTitle = todoTitle;
    }

    public String getTodoStatus() {
        return todoStatus;
    }

    public void setTodoStatus(String todoStatus) {
        this.todoStatus = todoStatus;
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }
}
