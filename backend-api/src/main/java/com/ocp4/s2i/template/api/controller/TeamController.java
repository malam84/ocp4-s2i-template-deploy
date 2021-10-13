package com.ocp4.s2i.template.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ocp4.s2i.template.api.model.Team;
import com.ocp4.s2i.template.api.service.TeamService;

/**
 * 
 * @author malam84
 *
 */

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class TeamController {

	@Autowired
	private TeamService teamService;

	@PostMapping("/team/save")
	public ResponseEntity<Team> createTeam(@RequestBody Team team) {
		try {
			Team _team = teamService.saveTeam(team);
			return new ResponseEntity<>(_team, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/team")
	public ResponseEntity<List<Team>> findByPublished() {
		try {
			List<Team> teamLst = teamService.findAllTeamMember();
			if (teamLst.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(teamLst, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/team/{id}")
	public ResponseEntity<HttpStatus> deleteTeam(@PathVariable("id") long id) {
		try {
			teamService.deleteTeamMember(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
