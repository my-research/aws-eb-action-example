package com.serverapp;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepository {

    private List<Todo> dataStorage = new ArrayList<>();

    public void save(Todo todo) {
        dataStorage.add(todo);
    }

    public List<Todo> findAll() {
        return dataStorage;
    }
}
