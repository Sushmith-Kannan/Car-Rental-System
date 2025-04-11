package com.api.carrental.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.carrental.Service.ReviewFeedbackService;

@RestController
public class ReviewFeedbackController {
	@Autowired
	private ReviewFeedbackService reviewFeedbachService;

	@GetMapping("/api/buyer/showByRating/{rating}")
	public void showByRating(@PathVariable int rating){
	
		return reviewFeedbachService.getByRating(rating);
	}
	}
