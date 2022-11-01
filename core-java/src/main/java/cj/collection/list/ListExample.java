package cj.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1001);
    list.add(1005);
    list.add(1004);
    list.add(1003);
    list.add(1002);
    System.out.println(list.size());
    System.out.println(list.isEmpty());
    System.out.println(list.get(3));

    // using for loop
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
    // using for each
    for (Integer ele : list) {
      System.out.println(ele);
    }
    // using iterator
    Iterator<Integer> iterator = list.iterator();
    while (iterator.hasNext()) {
      int ele = iterator.next();
      if (ele == 1005) {
        iterator.remove();
      }
      System.out.println(ele);
    }
    iterator.forEachRemaining(ele -> {
      System.out.println(ele);
    });
    // List iterator

    ListIterator<Integer> listIterator = list.listIterator();
    System.out.println("Using list iterator");
    while (listIterator.hasNext()) {
      int ele = listIterator.next();
      System.out.print(ele + " ");
    }
    System.out.println();
    while (listIterator.hasPrevious()) {
      int ele = listIterator.previous();
      System.out.print(ele + " ");
    }

    System.out.println();
    // Using streams
    list.stream().forEach(ele -> {
      System.out.println(ele);
    });

  }


}
