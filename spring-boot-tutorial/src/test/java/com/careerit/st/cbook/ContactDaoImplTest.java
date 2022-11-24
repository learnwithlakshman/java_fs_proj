package com.careerit.st.cbook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

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
  @Test
  void insertContactTest(){
      Contact contact = new Contact();
      contact.setName("Charan Raj");
      contact.setMobile("9988998899");
      contact.setEmail("charan.raj@gmail.com");
      Contact savedContact = contactDao.insertContact(contact);
      System.out.println(savedContact);
      Assertions.assertNotNull(savedContact.getId());
  }
  @Test
  void insertContactsTest(){
    List<Contact> list = new ArrayList<>();
    for(int i=1;i<=200;i++) {
      Contact contact = new Contact();
      contact.setName("User"+i);
      contact.setMobile("9988998"+ ThreadLocalRandom.current().nextInt(100,1000));
      contact.setEmail("user_"+i+"@gmail.com");
      list.add(contact);
    }
    int size=contactDao.insertContacts(list);
    Assertions.assertEquals(200,size);
  }




}
