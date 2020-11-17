package com.org.dxc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="points_table")
public class TeamDetails {
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	private int teamId;
	private String teamName;
	private int points;
	private int ranking;
	public TeamDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TeamDetails(int teamId, String teamName, int points, int ranking) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.points = points;
		this.ranking = ranking;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + points;
		result = prime * result + ranking;
		result = prime * result + teamId;
		result = prime * result + ((teamName == null) ? 0 : teamName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TeamDetails other = (TeamDetails) obj;
		if (points != other.points)
			return false;
		if (ranking != other.ranking)
			return false;
		if (teamId != other.teamId)
			return false;
		if (teamName == null) {
			if (other.teamName != null)
				return false;
		} else if (!teamName.equals(other.teamName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TeamDetails [teamId=" + teamId + ", teamName=" + teamName + ", points=" + points + ", ranking="
				+ ranking + "]";
	}
	
	

}
