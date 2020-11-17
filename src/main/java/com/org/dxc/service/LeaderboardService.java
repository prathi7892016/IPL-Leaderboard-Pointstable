package com.org.dxc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dxc.model.Leaderboard;
import com.org.dxc.repository.LeaderboardRepository;
@Service
public class LeaderboardService {
	@Autowired
	LeaderboardRepository repo;
	

	public List<Leaderboard> getLeaderboard() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Leaderboard bidderById(int id) {
		// TODO Auto-generated method stub
		Optional<Leaderboard> leaderboard = repo.findById(id);

		return leaderboard.get();
	}
	

	public  Leaderboard updateLeaderboard(Leaderboard leaderboard) {
		// TODO Auto-generated method stub
		Optional<Leaderboard> toUpdate = repo.findById(leaderboard.getId());
		Leaderboard lb =toUpdate.get();
		lb.setBidderPoints(leaderboard.getBidderPoints());
		lb.setBidsWon(leaderboard.getBidsWon());
		return repo.save(lb);
	}


}
