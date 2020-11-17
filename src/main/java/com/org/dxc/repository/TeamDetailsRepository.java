package com.org.dxc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.dxc.model.TeamDetails;
@Repository
public interface TeamDetailsRepository extends JpaRepository<TeamDetails, Integer> {

}
