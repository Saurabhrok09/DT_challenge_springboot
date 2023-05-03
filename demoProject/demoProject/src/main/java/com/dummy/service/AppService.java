package com.dummy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.dummy.entity.AppBins;
import com.dummy.repo.AppRepo;



@RestController
public class AppService {
	@Autowired
	private AppRepo appRepo;

	public AppBins addProduct(AppBins productbin) {
		// TODO Auto-generated method stub
		return appRepo.save(productbin);
	}

	public AppBins getProductById(int uid) {
		// TODO Auto-generated method stub
		return appRepo.findById(uid);
	}

	public AppBins getProductByEventName(String name) {
		// TODO Auto-generated method stub
		return appRepo.findByName(name);
	}

	public AppBins getProductByEventtype(String type) {
		// TODO Auto-generated method stub
		return appRepo.findByType(type);
	}

	public List<AppBins> deleteProductById(int uid) {
		// TODO Auto-generated method stub
		
		 appRepo.deleteById(uid);
		 return appRepo.findAll();
	}

	public AppBins putProduct(int uid, AppBins productbin) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		AppBins response=appRepo.findById(uid).get();
				AppBins p=new AppBins();
				
				if(response!=null) {
					response.setName(productbin.getName());
					response.setAttendees(productbin.getAttendees());
					response.setCategory(productbin.getCategory());
					response.setDescription(productbin.getDescription());
					response.setFiles(productbin.getFiles());
					response.setModerator(productbin.getModerator());
					response.setRigor_rank(productbin.getRigor_rank());
					response.setSub_category(productbin.getSub_category());
					response.setTagline(productbin.getTagline());
					response.setType(productbin.getType());
					p=appRepo.save(response);
				}
				
				return p;
	}






	
}
