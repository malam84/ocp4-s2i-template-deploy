package com.ocp4.s2i.template.api.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ocp4.s2i.template.api.model.Team;
import com.ocp4.s2i.template.api.repository.TeamRepository;
import com.ocp4.s2i.template.api.service.TeamService;

/**
 * 
 * @author malam84
 *
 */

@Service
public class TeamServiceImpl implements TeamService {

	@Autowired
	private TeamRepository teamRepository;
	
	@Override
	public Team saveTeam(Team team) {
		return teamRepository.save(team);
		
	}

	@Override
	public List<Team> findAllTeamMember(){
		return (List<Team>) teamRepository.findAll();
		
	}

	@Override
	public void deleteTeamMember(long id) {
        teamRepository.deleteById(id);
	}	

}
