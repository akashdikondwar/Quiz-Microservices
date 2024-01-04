package com.quiz.quizService.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.quizService.entities.Quiz;
import com.quiz.quizService.service.QuizServiceImpl;

@RestController
@RequestMapping("/quiz")
public class QuizController {
	@Autowired
	private QuizServiceImpl quizServiceImpl;
	
//	public QuizController (QuizServiceImpl quizServiceImpl) {
//		this.quizServiceImpl = quizServiceImpl;
//	}

	@PostMapping
	public Quiz add(@RequestBody Quiz quiz) {
		return quizServiceImpl.add(quiz);
	}
	
	@GetMapping
	public List<Quiz> get() {
		return quizServiceImpl.getQuizList();
	}
	
	@GetMapping("/{quizId}")
	public Quiz getQuiz(@PathVariable Long quizId) {
		return quizServiceImpl.getQuiz(quizId);
	}
}
