package com.careerit.jdbc.todo.dao;

import com.careerit.jdbc.todo.domain.Todo;

import java.util.List;

public interface TodoDao {
    Todo addTodo(Todo todo);
    List<Todo> getActiveTodos();
    boolean changeStatus(int id);
}
