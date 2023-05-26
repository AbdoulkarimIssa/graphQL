package org.issa.tse;

import java.util.List;

public class TeamDao {

	private List<Team> teams;
	
	public TeamDao(List<Team> teams) {

		this.teams = teams;
	}

	public List<Team> getAllTeams() {
		
		return this.teams;
	}

	public Team saveTeam(Team team){
		this.teams.add(team);

		return team;
	}
}
