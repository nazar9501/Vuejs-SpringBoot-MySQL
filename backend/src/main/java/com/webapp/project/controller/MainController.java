package com.webapp.project.controller;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.project.dao.DataRepository;
import com.webapp.project.model.Data;

@RestController
public class MainController {
    
	@Autowired
    DataSource dataSource;
	
	@Autowired
    DataRepository dataRepository;
	
    @RequestMapping(value = "/api/data")
    public Iterable<Data> findAllData() {
    	return dataRepository.findAll();
    }
    
    @RequestMapping(value = "/api/data/save")
    public void saveData(@RequestBody Data data) {
    	dataRepository.save(data);
    }
    
    @RequestMapping(value = "/api/data/delete")
    public void deleteData(@RequestBody Data data) {
    	dataRepository.delete(data.getId());
    }
    
    @RequestMapping(value = "/api/data/update")
    public void updateData(@RequestBody Data data) {
    	dataRepository.updateData(data.getId(), data.getName(), data.getW1(), data.getX(), data.getW2());
    }
    
}
