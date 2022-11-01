package cj.ems;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public final class FileReaderUtil {

  private static final String FILE_NAME = "/emp_data.csv";

  private FileReaderUtil() {
  }

  public static List<Employee> readDataFromCsv() {
    List<Employee> empList = new ArrayList<>();
    try {
      List<String> lines = Files.readAllLines(Path.of(FileReaderUtil.class.getResource(FILE_NAME).toURI()));
      for(int i=1;i<lines.size();i++){
        String[] arr = lines.get(i).split(",");
        Long id = Long.parseLong(arr[0]);
        String name = arr[1];
        String gender = arr[2];
        double salary = Double.parseDouble(arr[3]);
        String country = arr[4];
        Employee emp = new Employee(id,name,gender,salary,country);
        empList.add(emp);
      }
    } catch (Exception e) {
      System.out.println("While reading file :"+e);
    }
    return empList;
  }

}
