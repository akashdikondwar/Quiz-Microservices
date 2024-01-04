package com.quiz.QuestionService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.QuestionService.entities.Question;
import com.quiz.QuestionService.entities.QuestionRepository;

@Service
public class QuestionService {
	
//	@Autowired
	public QuestionRepository questionRepository;
	
	public QuestionService (QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}
	
	//add
	public Question add(Question question) {
		return questionRepository.save(question);
	}
	
	//getallQuestions
	public List<Question> getall() {
		return questionRepository.findAll();
	}
	
	//getOneQuestion
	public Question getone(Long id) {
		return questionRepository.findById(id).orElseThrow(()->new RuntimeException("Question not found !!"));
	}
	
	//getQuizQuestion
	public List<Question> getByQuiz(Long quizId){
		return questionRepository.findByquizId(quizId);
	}
}
