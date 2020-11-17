package com.org.dxc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dxc.model.TeamDetails;
import com.org.dxc.repository.TeamDetailsRepository;

@Service
public class TeamDetailsService {
	@Autowired
	 TeamDetailsRepository repo;
	public List<TeamDetails> getPointstable() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	public TeamDetails pointstableById(int id) {
		// TODO Auto-generated method stub
		Optional< TeamDetails> pointstable=repo.findById(id);
		return pointstable.get();
	}
	

	public TeamDetails updatePointstable(TeamDetails pointstable) {
		// TODO Auto-generated method stub
		Optional<TeamDetails>toUpdate = repo.findById(pointstable.getTeamId());
		TeamDetails td=toUpdate.get();
		td.setPoints(pointstable.getPoints());
		return repo.save(td);
	}



	

	

}
