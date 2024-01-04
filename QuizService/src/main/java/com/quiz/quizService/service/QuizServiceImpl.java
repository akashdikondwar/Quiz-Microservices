package com.quiz.quizService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.quizService.entities.Question;
import com.quiz.quizService.entities.Quiz;
import com.quiz.quizService.repositories.QuizRepository;

@Service
public class QuizServiceImpl implements QuizService{
	
	@Autowired
	public QuizRepository quizRepository;
	
	@Autowired
	public QuestionClient questionClient;
	
//	public QuizServiceImpl(QuizRepository quizRepository, QuestionClient questionClient) {
//		this.quizRepository = quizRepository;
//		this.questionClient = questionClient;
//	}

	@Override
	public Quiz add(Quiz quiz) {
		// TODO Auto-generated method stub
		return quizRepository.save(quiz);
	}

	@Override
	public Quiz getQuiz(Long id) {
		Quiz quiz = quizRepository.findById(id).orElseThrow(()->new RuntimeException("Quiz not found !!"));
		List<Question> questions = questionClient.getQuestionOfQuiz(id);
		quiz.setQuestions(questions);
		//now we will require questions list from question microservice.
		//for that we have to use client
		return quiz;
	}

	@Override
	public List<Quiz> getQuizList() {
		return quizRepository.findAll();
	}

	
	
}
