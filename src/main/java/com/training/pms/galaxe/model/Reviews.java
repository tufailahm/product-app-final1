package com.training.pms.galaxe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reviews {

	private int reviewId;
	private String comments;
	private int rating;
	
	


}
