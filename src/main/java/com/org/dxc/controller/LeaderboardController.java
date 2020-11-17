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

import com.org.dxc.model.Leaderboard;
import com.org.dxc.service.LeaderboardService;

@RestController
@RequestMapping(value="/web")
@CrossOrigin(origins="http://localhost:4200")
public class LeaderboardController {
	@Autowired
LeaderboardService service;
	
	
	@GetMapping("/leaderboard")
	public List<Leaderboard>getLeaderboard() {
		return service.getLeaderboard() ;
	}
	@GetMapping("/leaderboard/{id}")
	public Leaderboard getBidderById(@PathVariable int id) {
		return service.bidderById(id);
		
	}
	
@PostMapping(value="/leaderboard")
public Leaderboard updateLeaderboard(@RequestBody Leaderboard leaderboard) {
	System.out.println("leaderboard update ");
	return service.updateLeaderboard(leaderboard);
}

}
