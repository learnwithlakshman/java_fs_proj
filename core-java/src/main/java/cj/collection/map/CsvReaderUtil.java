package cj.collection.map;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CsvReaderUtil {
  private static final String FILE_NAME = "/userdata.csv";


  public static List<AppUser> loadUsers() {
    List<AppUser> list = new ArrayList<>();
    try {
      List<String> lines = Files.readAllLines(Path.of(com.careerit.cj.playerstat.util.CsvReaderUtil.class.getResource(FILE_NAME).toURI()));
      return lines.stream().skip(1).map(ele -> convertUser(ele)).collect(Collectors.toList());
    } catch (Exception e) {
      e.printStackTrace();
    }
    return list;
  }

  private static AppUser convertUser(String ele) {
    String[] arr = ele.split(",");
    Long id = Long.parseLong(arr[0]);
    String firstName = arr[1];
    String lastName = arr[2];
    String email = arr[3];
    Gender gender = Gender.valueOf(arr[4]);
    String password = arr[5];
    return AppUser.builder().
        id(id)
        .firstName(firstName)
        .lastName(lastName)
        .email(email)
        .gender(gender)
        .password(password).build();
  }

}
