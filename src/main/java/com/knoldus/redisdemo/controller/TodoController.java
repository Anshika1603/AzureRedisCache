package com.knoldus.redisdemo.controller;

import com.knoldus.redisdemo.model.Todo;
import com.knoldus.redisdemo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class TodoController {


    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    public Todo createTodo(@RequestBody Todo todo) {
        return todoRepository.save(todo);
    }

    @GetMapping("/get")
    public Iterable<Todo> findAllTodos() {
        return todoRepository.findAll();
    }
}

