package com.careerit.jdbc.todo.dao;

import com.careerit.jdbc.todo.domain.Todo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TodoDaoImpl implements TodoDao {
  @Override
  public Todo addTodo(Todo todo) {
    Connection con = null;
    PreparedStatement st = null;
    ResultSet rs=null;
    try {
      con = DbUtil.getConnection();
      st = con.prepareStatement("insert into todo(title,status) values(?,?)",Statement.RETURN_GENERATED_KEYS);
      st.setString(1, todo.getTitle());
      st.setBoolean(2, todo.isStatus());
      st.executeUpdate();
      rs=st.getGeneratedKeys();
      if(rs.next()){
          int key = rs.getInt(1);
          todo.setId(key);
      }
    } catch (SQLException e) {
      System.out.println("While adding todo :" + e);
    }finally {
        DbUtil.close(rs,st,con);
    }
    return todo;
  }


  @Override
  public List<Todo> getActiveTodos() {
    Connection con = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    List<Todo> list = new ArrayList<>();
    try {
      con = DbUtil.getConnection();
      st = con.prepareStatement("select id, title, status from todo where status=?");
      st.setBoolean(1, false);
      rs = st.executeQuery();
      while (rs.next()) {
        Todo todo = new Todo();
        todo.setId(rs.getInt("id"));
        todo.setTitle(rs.getString("title"));
        todo.setStatus(rs.getBoolean("status"));
        list.add(todo);
      }
    } catch (SQLException e) {
      System.out.println("While getting active todos :" + e);
    } finally {
      DbUtil.close(rs, st, con);
    }
    return list;
  }

  @Override
  public boolean changeStatus(int id) {
    Connection con = null;
    PreparedStatement st = null;
    try {
      con = DbUtil.getConnection();
      st = con.prepareStatement("update todo set status = not status where id=?");
      st.setInt(1,id);
      int count = st.executeUpdate();
      return count != 0;
    } catch (SQLException e) {
      System.out.println("While updating todo :" + e);
    }finally {
      DbUtil.close(st,con);
    }
    return false;
  }

}
