package com.ocp4.s2i.template.api.service;


import java.util.List;

import com.ocp4.s2i.template.api.model.Team;

/**
 * 
 * @author malam84
 *
 */

public interface TeamService {
	
	Team saveTeam(Team team);
	List<Team> findAllTeamMember();
	void deleteTeamMember(long id);
}
