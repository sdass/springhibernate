package com.subra.buiss;

import com.subra.model.Teams;

public interface TeamBusinessInterface {
	void save (Teams team);
	void update (Teams team);
	void delete (Teams team);
	Teams findByTeamId(Long id);

}
