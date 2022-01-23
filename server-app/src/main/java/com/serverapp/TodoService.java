package com.serverapp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class TodoService {
    private final TodoRepository todoRepository;

    public void createTodo(String todoName) {
        String todoId = UUID.randomUUID().toString();

        Todo todo = Todo.builder()
                .todoId(todoId)
                .todoName(todoName)
                .createdAt(LocalDateTime.now())
                .build();

        todoRepository.save(todo);
    }

    public List<Todo> getAllTodo() {
        return todoRepository.findAll();
    }
}
