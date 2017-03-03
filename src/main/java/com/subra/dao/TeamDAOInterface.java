package com.subra.dao;

import com.subra.model.Teams;

public interface TeamDAOInterface {
	void save(Teams team);
	void update(Teams team);
	void delete(Teams team);
	Teams findByTeamId(Long id);

}
