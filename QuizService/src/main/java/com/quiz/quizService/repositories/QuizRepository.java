package com.quiz.quizService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.quizService.entities.Quiz;

//below interface ka implementation automatically ban jayega.
//after extending this interface with jpa repository, it will get all the methods provided by jpa.
//the arguments <Quiz, Long> tells jparepository to find data from quiz table with id of long type.
//internally jparepository might gets connected automatically to database.

public interface QuizRepository extends JpaRepository<Quiz, Long>{
	
}
