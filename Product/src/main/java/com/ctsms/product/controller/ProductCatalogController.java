package com.ctsms.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ctsms.product.model.Product;
import com.ctsms.product.service.ProductCatalogService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductCatalogController {
	
	@Autowired
	private ProductCatalogService catalogService;
	
	@GetMapping
	public ResponseEntity<?> getAllProducts(){
		List<Product> response = new ArrayList<>();
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	@GetMapping("/category/{category}")
	public ResponseEntity<?> getAllProductsByCategory(@PathVariable("category") String category){
		List<Product> response = new ArrayList<>();
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	
	@GetMapping("/search")
	public ResponseEntity<?> searchProducts(@RequestParam("q") String searchTerm){
		List<Product> response = new ArrayList<>();
		return ResponseEntity.status(HttpStatus.OK).body("success");
	}

}