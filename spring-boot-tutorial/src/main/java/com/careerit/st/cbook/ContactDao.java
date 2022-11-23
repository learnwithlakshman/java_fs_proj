package com.careerit.st.cbook;

import java.util.List;

public interface ContactDao {

      Contact insertContact(Contact contact);
      List<Contact> selectContacts();
      List<Contact> search(String str);
      Contact updateContact(Contact contact);
      boolean deleteContact(Long id);
      int insertContacts(List<Contact> list);
      Contact selectContact(Long id);
}
