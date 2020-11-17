package com.org.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.dxc.model.TeamDetails;
import com.org.dxc.service.TeamDetailsService;

@RestController
@RequestMapping(value="/web")
@CrossOrigin(origins="http://localhost:4200")
public class TeamDetailsController {
	@Autowired
TeamDetailsService service;
	@GetMapping("/pointstable")
	public List<com.org.dxc.model.TeamDetails>getPointstable(){
		return service.getPointstable();
		
	}
	@GetMapping("/pointstable/{id}")
	public TeamDetails getPointstableById(@PathVariable int id) {
		return service.pointstableById(id);
		
	}
	@PostMapping("/pointstable")
	public TeamDetails updatePointstable(@RequestBody TeamDetails pointstable) {
		System.out.println("pointstable update ");
		return service.updatePointstable(pointstable);
	}
	}

