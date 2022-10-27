package com.careerit.cj.collection.map;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class WordCount {

  public static void main(String[] args) {
    String str = "hi learning java is fun and java is fun language to have fun learn java";
    String[] words = str.split(" ");
    Map<String,Integer> map = new HashMap<>();
    for(String word:words){
          map.putIfAbsent(word,0);
          map.put(word,map.get(word)+1);
    }
    System.out.println(map);
  }
}
