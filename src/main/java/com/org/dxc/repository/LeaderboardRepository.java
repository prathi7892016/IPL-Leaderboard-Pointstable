package com.org.dxc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.dxc.model.Leaderboard;
@Repository
public interface LeaderboardRepository extends JpaRepository<Leaderboard, Integer> {

	

}
