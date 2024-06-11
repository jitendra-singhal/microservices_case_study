package com.ctsms.product.model;

//import jakarta.persistence.Entity;
import lombok.Data;

//@Entity
@Data
public class Product {
	
	private int id;
	private String description;
	private String imageUrl;
	private String name;
	private float price;
	private String category;
	private String availability;
    
}
