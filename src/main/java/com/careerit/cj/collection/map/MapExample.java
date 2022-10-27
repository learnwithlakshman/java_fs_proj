package com.careerit.cj.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
  public static void main(String[] args) {

    Map<String,Integer> countMap = new HashMap<>();
    countMap.put("Hello",2);
    if(countMap.get("Hello")==null){
        countMap.put("Hello",1);
    }
    countMap.put("Hello",countMap.get("Hello")+1);
    System.out.println(countMap);



    Map<String, Integer> map = new HashMap<>();
    map.put("krish", 25);
    map.put("manoj", 41);
    map.put("rajesh", 40);
    map.put("latha", 28);
    map.put("john", 35);
    map.put("krish",38);

    System.out.println(map.get("manoj"));
    System.out.println(map.getOrDefault("charan",18));


    Set<String> set = map.keySet();
    for(String key:set){
      System.out.println(key+" "+map.get(key));
    }

    Collection<Integer> values = map.values();
    for(Integer ele:values){
      System.out.println(ele);
    }

    Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
    for(Map.Entry<String,Integer> entry:entrySet){
      System.out.println(entry.getKey()+" "+entry.getValue());
    }
    map.entrySet().forEach(entry->{
      System.out.println(entry.getKey()+" "+entry.getValue());
    });
  }
}
