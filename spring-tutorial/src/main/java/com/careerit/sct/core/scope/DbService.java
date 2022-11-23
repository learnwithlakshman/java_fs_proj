package com.careerit.sct.core.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Random;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Repository
@Scope("prototype")
public class DbService {

  public List<Integer> getRandom10Numbers() {
    List<Integer> list = new Random().ints(20)
        .boxed()
        .collect(Collectors.toList());
    System.out.println(list);
    return list;
  }


}
