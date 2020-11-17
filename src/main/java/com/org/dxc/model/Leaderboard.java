package com.org.dxc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="leaderboard")
public class Leaderboard {
	@Id
	@GenericGenerator(name = "auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "bidder_id")
	private int id;
	@Column(name = "bidder_name")
	private String bidderName;
	@Column(name = "bidder_points")
	private int bidderPoints;
	@Column(name = "bids_participated")
	private int bidsParticipated;
	@Column(name = "bids_won")
	private int bidsWon;
	public Leaderboard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Leaderboard(int id, String bidderName, int bidderPoints, int bidsParticipated, int bidsWon) {
		super();
		this.id = id;
		this.bidderName = bidderName;
		this.bidderPoints = bidderPoints;
		this.bidsParticipated = bidsParticipated;
		this.bidsWon = bidsWon;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBidderName() {
		return bidderName;
	}
	public void setBidderName(String bidderName) {
		this.bidderName = bidderName;
	}
	public int getBidderPoints() {
		return bidderPoints;
	}
	public void setBidderPoints(int bidderPoints) {
		this.bidderPoints = bidderPoints;
	}
	public int getBidsParticipated() {
		return bidsParticipated;
	}
	public void setBidsParticipated(int bidsParticipated) {
		this.bidsParticipated = bidsParticipated;
	}
	public int getBidsWon() {
		return bidsWon;
	}
	public void setBidsWon(int bidsWon) {
		this.bidsWon = bidsWon;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bidderName == null) ? 0 : bidderName.hashCode());
		result = prime * result + bidderPoints;
		result = prime * result + bidsParticipated;
		result = prime * result + bidsWon;
		result = prime * result + id;
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
		Leaderboard other = (Leaderboard) obj;
		if (bidderName == null) {
			if (other.bidderName != null)
				return false;
		} else if (!bidderName.equals(other.bidderName))
			return false;
		if (bidderPoints != other.bidderPoints)
			return false;
		if (bidsParticipated != other.bidsParticipated)
			return false;
		if (bidsWon != other.bidsWon)
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Leaderboard [id=" + id + ", bidderName=" + bidderName + ", bidderPoints=" + bidderPoints
				+ ", bidsParticipated=" + bidsParticipated + ", bidsWon=" + bidsWon + "]";
	}
	

}


