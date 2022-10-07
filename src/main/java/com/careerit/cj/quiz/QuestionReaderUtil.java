package com.careerit.cj.quiz;


import com.careerit.cj.playerstat.util.CsvReaderUtil;

import javax.swing.text.html.Option;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public final class QuestionReaderUtil {

  private static final String fileName = "/quiz.txt";

  private QuestionReaderUtil() {
  }

  public static List<Question> loadQuestionsFromFile() {
    List<Question> questions = new ArrayList<>();
    try {
      List<String> lines = Files.readAllLines(Path.of(CsvReaderUtil.class.getResource(fileName).toURI()));
      for (int i = 0; i < lines.size(); ) {
        List<String> subList = lines.subList(i, i + 7);
        int num = Integer.parseInt(subList.get(0).replace("#",""));
        String questionData = subList.get(1);
        List<String> options = subList.subList(2,6);
        int answer = Integer.parseInt(subList.get(6).split(":")[1]);
        i = i + 7;
        Question question = new Question();
        question.setNum(num);
        question.setQuestionData(questionData);
        question.setAnswer(answer);
        question.setOptions(options);
        questions.add(question);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return questions;
  }
}


