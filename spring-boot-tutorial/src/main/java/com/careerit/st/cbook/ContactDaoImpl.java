package com.careerit.st.cbook;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

@Repository
@Slf4j
public class ContactDaoImpl implements  ContactDao{

  @Autowired
  private JdbcTemplate jdbcTemplate;

  @Override
  public Contact insertContact(Contact contact) {
    return null;
  }

  @Override
  public List<Contact> selectContacts() {
    List<Contact> list = jdbcTemplate.query("select id,name,email,mobile from contact",new ContactMapper());
    log.info("Contact count is :{}",list.size());
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
  public int insertContacts(List<Contact> list) {
    return 0;
  }

  @Override
  public Contact selectContact(Long id) {
    List<Contact> list = jdbcTemplate.query("select id,name,email,mobile from contact where id=?",
        ps -> ps.setLong(1, id), new ContactMapper());
    if(CollectionUtils.isEmpty(list)){
        throw new IllegalArgumentException("Contact is not exists with given id");
    }
    return list.get(0);
  }
}
