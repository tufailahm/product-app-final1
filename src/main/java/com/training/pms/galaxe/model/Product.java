package com.training.pms.galaxe.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "freshproducts")
@Data
public class Product {

	@Id
	private int productId;
	private String productName;
	private int quantityOnHand;
	private int price;
	

	
	
}
