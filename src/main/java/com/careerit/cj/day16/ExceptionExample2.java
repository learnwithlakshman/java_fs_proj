package com.careerit.cj.day16;

import com.careerit.cj.playerstat.util.CsvReaderUtil;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ExceptionExample2 {
  public static void main(String[] args) {
    try {
      List<String> list = readDataFromFile();
      System.out.println(list);
    } catch (IOException | URISyntaxException e) {
      System.out.println("While reading file :" + e);
    }
  }
  public static List<String> readDataFromFile() throws IOException, URISyntaxException {
    return Files.readAllLines(Path.of(CsvReaderUtil.class.getResource("/dept.csv").toURI()));
  }
}
