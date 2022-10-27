package com.careerit.cj.collection.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample1 {

  public static void main(String[] args) {

    Set<Integer> set = new HashSet<>();
    set.add(1001);
    set.add(1002);
    set.add(1005);
    set.add(1001);
    set.add(1002);
    set.add(1003);
    set.add(1004);

    set.stream().forEach(ele->{
      System.out.println(ele);
    });

    for(Integer ele:set){
      System.out.println(ele);
    }
    Iterator<Integer> iterator = set.iterator();
    while(iterator.hasNext()){
        int ele = iterator.next();
      System.out.println(ele);
    }

    System.out.println(set.isEmpty());
  }
}
