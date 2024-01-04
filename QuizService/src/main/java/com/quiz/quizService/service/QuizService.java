package com.quiz.quizService.service;


import java.util.List;

import com.quiz.quizService.entities.Question;
import com.quiz.quizService.entities.Quiz;


//below is the interface which contains various methods to be used by quizService
public interface QuizService {
	
	Quiz add(Quiz quiz);
	
	Quiz getQuiz(Long id);
	
	List<Quiz> getQuizList();
}
