//package com.quiz.QuestionService.service;
//
//import java.util.List;
//
//import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
//import org.springframework.data.jpa.repository.JpaRepository;
//
////this is just for experiment. It is possible to create only one
////class questionservice without questionrepository interface and questionservice interface.
////we can write everything in one but its not recommended.
//
//public abstract class QuestionServiceTemp implements JpaRepository<Question, Long>{
//
//
//	public Question add(Question question) {
//		return save(question);
//	}
//	
//	public List<Question> get(){
//		return findAll();
//	}
//	
////	public Question getone(Long id) {
////		return findById(id)
////	}
//}
