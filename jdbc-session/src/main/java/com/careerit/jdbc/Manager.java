package com.careerit.jdbc;

import com.careerit.jdbc.todo.dao.DbUtil;
import com.careerit.jdbc.todo.dao.TodoDao;
import com.careerit.jdbc.todo.dao.TodoDaoImpl;
import com.careerit.jdbc.todo.domain.Todo;

import java.sql.*;
import java.util.List;

public class Manager {

  public static void main(String[] args) {

    TodoDao todoDao = new TodoDaoImpl();
    todoDao.changeStatus(11);

//    Todo todo = new Todo();
//    todo.setTitle("Learning Spring with examples");
//    todo.setStatus(false);
//    Todo savedTodo = todoDao.addTodo(todo);
//    System.out.println("Todo is added with id:"+savedTodo.getId());

//    List<Todo> list = todoDao.getActiveTodos();
//    list.stream().forEach(ele->{
//      System.out.println(ele.getTitle());
//    });

  }



}
