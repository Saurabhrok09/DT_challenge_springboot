package com.dummy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dummy.entity.AppBins;
import com.dummy.service.AppService;


@RestController
public class AppController {
	@Autowired
	private AppService productservice;
	@GetMapping("/")
	public String msg() {
		return"welcome saurabh";
	}
	@PostMapping(value="/add")
	public ResponseEntity<AppBins> addProduct(@RequestBody AppBins productbin){
		return new ResponseEntity<AppBins>(productservice.addProduct(productbin),HttpStatus.OK);
		////http://localhost:8080/add in postman select post   
	}
	@GetMapping(value="/getById")
	public ResponseEntity<AppBins> getProductById(@RequestParam int uid){
		return new ResponseEntity<AppBins>(productservice.getProductById(uid),HttpStatus.OK);
		//http://localhost:8080/getByname?name=wipro
	}
	@GetMapping(value="/events")
	public ResponseEntity<AppBins> getProductByEventName(@RequestParam String name){
		return new ResponseEntity<AppBins>(productservice.getProductByEventName(name),HttpStatus.OK);
		//http://localhost:8080/getByname?name=wipro
	}
	@GetMapping(value="/eventsByType")
	public ResponseEntity<AppBins> getProductByEventType(@RequestParam String type){
		return new ResponseEntity<AppBins>(productservice.getProductByEventtype(type),HttpStatus.OK);
		//http://localhost:8080/getByname?name=wipro
	}
	@DeleteMapping(value="/deleteByuid")
	public ResponseEntity<List<AppBins>> deleteProductById(@RequestParam int uid){
		return new ResponseEntity<List<AppBins>>(productservice.deleteProductById(uid),HttpStatus.OK);
		//http://localhost:8080/deleteById?Id=5
	}
	@PutMapping(value="/put/{uid}")
	public ResponseEntity<AppBins> putProduct(@PathVariable int uid , @RequestBody AppBins productbin){
		return new ResponseEntity<AppBins>(productservice.putProduct(uid,productbin),HttpStatus.OK);
		//http://localhost:8080/put/3  med as put 
		// in body type          {"pid":3,"name":"Accenture","price":456002}
	}
}
