package com.careerit.st.cbook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

@SpringBootTest
class ContactDaoImplTest {
  @Autowired
  private ContactDao contactDao;

  @Test
  void getContactsTest() {
    List<Contact> list = contactDao.selectContacts();
    Assertions.assertEquals(2, list.size());
  }

  @Test
  void getContactByIdTest() {
    Contact contact = contactDao.selectContact(1L);
    Assertions.assertEquals("Krish", contact.getName());
  }

  @Test
  void getContactNonExistingIdTest() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> contactDao.selectContact(5L));
  }


}
