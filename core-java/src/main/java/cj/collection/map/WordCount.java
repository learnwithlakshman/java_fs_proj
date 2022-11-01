package cj.collection.map;

import java.util.HashMap;
import java.util.Map;

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
