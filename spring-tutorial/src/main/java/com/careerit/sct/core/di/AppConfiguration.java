package com.careerit.sct.core.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class AppConfiguration {

      @Bean
      public DbService dbService(){
          return new DbService();
      }
      @Bean
      public UserService userService(){
          UserService obj = new UserService();
          obj.setDbService(dbService());
          return obj;
      }

}
