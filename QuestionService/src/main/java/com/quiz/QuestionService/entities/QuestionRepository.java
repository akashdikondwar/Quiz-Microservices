package com.quiz.QuestionService.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuestionRepository extends JpaRepository<Question, Long>{
	// this repository is created because sometimes we want custom methods
	//which are not there by default in jpaRepository.
	
	public List<Question> findByquizId(Long quizId);
	// jpa has feature to create custom methods using 
	//	findby{columnName}
}
