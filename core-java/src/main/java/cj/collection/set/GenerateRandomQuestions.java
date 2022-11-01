package cj.collection.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomQuestions {

  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();
        while(set.size()<50){
           int num = ThreadLocalRandom.current().nextInt(1,201);
            set.add(num);
        }
    System.out.println(set.size());
    System.out.println(set);

    List<String> cs = List.of("Krish","Manoj","Charan","Rajesh","Kiran");
    List<String> is = List.of("Krish","Suman","Charan","Rajesh","Manoj");
    List<String> ec = List.of("Krish","Jagan","Rajesh");

    Set<String> facultyNames = new HashSet<>();
    facultyNames.addAll(cs);
    facultyNames.addAll(is);
    facultyNames.addAll(ec);
    System.out.println(facultyNames);
    // get employee name who is working for only one department

    for(String name:facultyNames){
        if((cs.contains(name) && is.contains(name)) ||(is.contains(name) &&ec.contains(name))){
            continue;
        }else{
          System.out.println(name);
        }
    }
  }
}
