package com.api.carrental.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.carrental.model.Car;

@Service
public class ReviewFeedbackService {
	
	@Autowired
	private BuyerService buyerService;

	public Object getByRating(int rating) {
		List<Car> approved=buyerService.getAll();
		return approved;
	}

}
