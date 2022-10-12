package com.careerit.cj.collection.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListExample2 {

  public static void main(String[] args) {

    List<Integer> list1 = new ArrayList<>();
    list1.add(1001);
    list1.add(1003);
    list1.add(1005);
    List<Integer> list2 = new ArrayList<>();
    list2.add(1002);
    list2.add(1004);
    list2.add(1006);

    List<Integer> list = new ArrayList<>();
    list.addAll(list1);
    list.addAll(list2);
    System.out.println(list);
    System.out.println(list.contains(1001));
    System.out.println(list.containsAll(list1));
    list.removeAll(list1);
    System.out.println(list.subList(1,3));
    List<Integer> sortedList = list.stream().sorted((e1, e2) -> e1.compareTo(e2)).collect(Collectors.toList());
    System.out.println(sortedList);

  }
}
