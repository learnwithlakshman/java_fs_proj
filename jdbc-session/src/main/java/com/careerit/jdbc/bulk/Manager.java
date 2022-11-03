package com.careerit.jdbc.bulk;

import com.careerit.jdbc.todo.dao.DbUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Manager {

  public static void main(String[] args) {
//    List<AppUser> appUserList = CsvReaderUtil.loadFromFile();
//    addUsers(appUserList);
    System.out.println(getByCountryName("China").size());
  }

  public static void addUsers(List<AppUser> list) {

    Connection con = null;
    PreparedStatement st = null;
    try {
      con = DbUtil.getConnection();
      long startTime = System.currentTimeMillis();
      /*for (AppUser appUser : list) {
        st = con.prepareStatement("insert into app_user(id,name,country,salary,gender) values(?,?,?,?,?)");
        st.setLong(1, appUser.getId());
        st.setString(2, appUser.getName());
        st.setString(3, appUser.getCountry());
        st.setDouble(4, appUser.getSalary());
        st.setString(5, appUser.getGender());
        st.executeUpdate();
      }*/
      st = con.prepareStatement("insert into app_user(id,name,country,salary,gender) values(?,?,?,?,?)");
      int count = 0;
      for (AppUser appUser : list) {
        st.setLong(1, appUser.getId());
        st.setString(2, appUser.getName());
        st.setString(3, appUser.getCountry());
        st.setDouble(4, appUser.getSalary());
        st.setString(5, appUser.getGender());
        st.addBatch();
        count++;
        if (count % 100 == 0) {
          st.executeBatch();
        }

      }

      long endTime = System.currentTimeMillis();
      System.out.println(endTime - startTime);
    } catch (SQLException e) {
      System.out.println(e);
    } finally {
      DbUtil.close(st, con);
    }
  }

  public static List<AppUser> getByCountryName(String countryName) {
    Connection con = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    List<AppUser> list = new ArrayList<>();
    try{
        con = DbUtil.getConnection();
        st = con.prepareStatement("select id,name,country,salary,gender from app_user where lower(country) = ?");
        st.setString(1,countryName.toLowerCase());
        rs = st.executeQuery();
        while(rs.next()){
            AppUser appUser = new AppUser();
            appUser.setId(rs.getInt("id"));
            appUser.setName(rs.getString("name"));
            appUser.setCountry(rs.getString("country"));
            appUser.setSalary(rs.getDouble("salary"));
            appUser.setGender(rs.getString("gender"));
            list.add(appUser);
        }
    }catch (SQLException e){
      e.printStackTrace();
    }finally {
        DbUtil.close(rs,st,con);
    }
    return list;
  }

  public static List<CountryStats> getUserStas(){
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    List<CountryStats> list = new ArrayList<>();
    try{
      con = DbUtil.getConnection();
      st = con.createStatement();
      rs = st.executeQuery("select coutry,count(*) as count,max(salary) max,min(salary) as min,avg(salary) as avg from app_user");
      while(rs.next()){
          CountryStats obj = new CountryStats();
          obj.setName(rs.getString("country"));
          obj.setCount(rs.getInt("count"));
          obj.setMaxSalary(rs.getDouble("max"));
          obj.setMinSalary(rs.getDouble("min"));
          obj.setAvgSalary(rs.getDouble("avg"));
          list.add(obj);
      }
    }catch (SQLException e){
      e.printStackTrace();
    }finally {
      DbUtil.close(rs,st,con);
    }
    return list;

  }


}
