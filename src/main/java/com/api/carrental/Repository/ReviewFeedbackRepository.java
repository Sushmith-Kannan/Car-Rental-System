package com.api.carrental.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.carrental.model.ReviewFeedback;

public interface ReviewFeedbackRepository extends JpaRepository<ReviewFeedback, Integer> {

}
