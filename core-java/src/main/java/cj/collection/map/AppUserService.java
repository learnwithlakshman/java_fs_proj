package cj.collection.map;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppUserService {

  List<AppUser> list;
  Map<String, AppUser> map;

  AppUserService() {
    list = CsvReaderUtil.loadUsers();
    map = list.stream().collect(Collectors.toMap(AppUser::getEmail, Function.identity()));
  }
  public AppUser getAppUser(String email) {
    AppUser appUser = map.get(email);
    if(appUser!=null){
      return appUser;
    }
    throw new IllegalArgumentException("User with given email is not found");
  }
}
