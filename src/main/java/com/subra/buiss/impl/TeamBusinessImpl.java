package com.subra.buiss.impl;

import com.subra.buiss.TeamBusinessInterface;
import com.subra.dao.TeamDAOInterface;
import com.subra.model.Teams;

public class TeamBusinessImpl implements TeamBusinessInterface {
	
	TeamDAOInterface teamDAOInterface;

	public void setTeamDAOInterface(TeamDAOInterface teamDAOInterf){
		this.teamDAOInterface = teamDAOInterf;
	}
	
	@Override
	public void save(Teams team) {
		this.teamDAOInterface.save(team);
		
	}

	@Override
	public void update(Teams team) {
		this.teamDAOInterface.update(team);
		
	}

	@Override
	public void delete(Teams team) {
		this.teamDAOInterface.delete(team);
		
	}

	@Override
	public Teams findByTeamId(Long id) {
		return teamDAOInterface.findByTeamId(id);
		
	}

}
