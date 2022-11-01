package com.careerit.jdbc.todo.dao;

import java.sql.*;

public final class DbUtil {

  private DbUtil() {

  }
  public static Connection getConnection() {
    Connection con = null;
    try {
      con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sql_tutorial", "dbuser", "dbuser");
    } catch (SQLException e) {
      System.out.println("While connecting with db :" + e);
    }
    return con;
  }
  public static void close(ResultSet rs, Statement st, Connection con) {
    try {
      if (rs != null) {
        rs.close();
      }
      if (st != null) {
        st.close();
      }
      if (con != null) {
        con.close();
      }
    } catch (SQLException e) {
      System.out.println("While closing resources :" + e);
    }
  }

  public static void close(Statement st, Connection con) {
    try {
      if (st != null) {
        st.close();
      }
      if (con != null) {
        con.close();
      }
    } catch (SQLException e) {
      System.out.println("While closing resources :" + e);
    }
  }


}
