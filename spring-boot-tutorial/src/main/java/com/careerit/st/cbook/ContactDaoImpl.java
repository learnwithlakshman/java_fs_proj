package com.careerit.st.cbook;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StopWatch;

import java.sql.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Repository
@Slf4j
public class ContactDaoImpl implements ContactDao {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  @Override
  public Contact insertContact(Contact contact) {
    KeyHolder keyHolder = new GeneratedKeyHolder();
    jdbcTemplate.update(con -> {
      PreparedStatement pst = con.prepareStatement("insert into contact(name,email,mobile) values(?,?,?)", Statement.RETURN_GENERATED_KEYS);
      pst.setString(1, contact.getName());
      pst.setString(2, contact.getEmail());
      pst.setString(3, contact.getMobile());
      return pst;
    }, keyHolder);
    long id = 0;
    Map<String, Object> keys = keyHolder.getKeys();
    if (keys != null) {
      id = (long) keys.get("id");
    }
    contact.setId(id);
    return contact;
  }

  @Override
  public List<Contact> selectContacts() {
    List<Contact> list = jdbcTemplate.query("select id,name,email,mobile from contact", new ContactMapper());
    log.info("Contact count is :{}", list.size());
    return list;
  }

  @Override
  public List<Contact> search(String str) {
    return Collections.emptyList();
  }

  @Override
  public Contact updateContact(Contact contact) {
    return null;
  }

  @Override
  public boolean deleteContact(Long id) {
    return false;
  }

  @Override
  @Transactional
  public int insertContacts(List<Contact> list) {
    StopWatch stopWatch = new StopWatch();
    stopWatch.start();
    int[][] statusArray = jdbcTemplate.batchUpdate("insert into contact(name,email,mobile) values(?,?,?)", list,
        50, (PreparedStatement pst, Contact contact) -> {
          pst.setString(1, contact.getName());
          pst.setString(2, contact.getEmail());
          pst.setString(3, contact.getMobile());
        });
    for (int[] arr : statusArray) {
     log.info(Arrays.toString(arr));
    }
    stopWatch.stop();
   log.info("Total duration :{}" , stopWatch.getLastTaskTimeMillis());
    return list.size();
  }

  @Override
  public Contact selectContact(Long id) {
    List<Contact> list = jdbcTemplate.query("select id,name,email,mobile from contact where id=?",
        ps -> ps.setLong(1, id), new ContactMapper());
    if (CollectionUtils.isEmpty(list)) {
      throw new IllegalArgumentException("Contact is not exists with given id");
    }
    return list.get(0);
  }
}
