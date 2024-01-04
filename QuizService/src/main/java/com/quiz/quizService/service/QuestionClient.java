package com.quiz.quizService.service;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quiz.quizService.entities.Question;


//feign client is just a way to fetch data from fetchapi

//@FeignClient(name = "QUESTION-SERVICE")
@FeignClient(url = "http://localhost:8091",value = "Question-Client")public interface QuestionClient {
	
  @GetMapping("/question/topic/{quizId}")
  List<Question> getQuestionOfQuiz(@PathVariable Long quizId);
}



