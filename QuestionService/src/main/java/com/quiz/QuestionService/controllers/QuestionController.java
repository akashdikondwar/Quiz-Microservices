package com.quiz.QuestionService.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.QuestionService.entities.Question;
import com.quiz.QuestionService.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	public QuestionService questionService;
	//this can also be done using autowired
	
//	public QuestionController(QuestionService questionService) {
//		this.questionService = questionService;
//	}
	
	// create
	@PostMapping
	private Question create(@RequestBody Question question) {
		return questionService.add(question);
	}
	
	//getAll
	@GetMapping
	private List<Question> getAll(){
		return questionService.getall();
	}
	
	//getOne
	@GetMapping("/{id}")
	private Question getOne(@PathVariable Long id) {
		return questionService.getone(id);
	}
	
	//get questions for a particular quiz
	@GetMapping("/topic/{quizId}")
	private List<Question> getTopicQuestions(@PathVariable Long quizId){
		return questionService.getByQuiz(quizId);
	}
}
