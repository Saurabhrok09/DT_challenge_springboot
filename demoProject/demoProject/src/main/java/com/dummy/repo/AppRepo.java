package com.dummy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dummy.entity.AppBins;



public interface AppRepo extends JpaRepository<AppBins, Integer>{

	AppBins findById(int uid);

	AppBins findByName(String name);

	AppBins findByType(String type);

}
