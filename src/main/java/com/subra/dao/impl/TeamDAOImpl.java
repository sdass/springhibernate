package com.subra.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.subra.dao.TeamDAOInterface;
import com.subra.model.Teams;

public class TeamDAOImpl extends HibernateDaoSupport implements TeamDAOInterface {

	@Override
	public void save(Teams team) {
		getHibernateTemplate().save(team);
		
	}

	@Override
	public void update(Teams team) {
		getHibernateTemplate().update(team);
		
	}

	@Override
	public void delete(Teams team) {
		getHibernateTemplate().delete(team);
		
	}

	@Override
	public Teams findByTeamId(Long id) {
		List<Teams> lists = getHibernateTemplate().find("from Teams where id =?", id);
		return (Teams) lists.get(0);
		
	}

}
