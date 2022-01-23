package com.serverapp;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/todos", produces = "application/json")
public class TodoController {
    private final TodoService todoService;

    @PostMapping
    public ResponseEntity<Todo> createTodo(@RequestBody CreateTodoRequest requestData) {
        String todoName = requestData.getTodoName();
        todoService.createTodo(todoName);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<Todo>> getAllTodo() {
        return ResponseEntity.ok(todoService.getAllTodo());
    }
}
