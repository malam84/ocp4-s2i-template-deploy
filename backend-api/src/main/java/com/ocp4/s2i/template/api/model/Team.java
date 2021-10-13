package com.ocp4.s2i.template.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "Team")
public class Team {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "TeamName")
	private String teamName;
	
	@Column(name = "DevName")
	private String devName;
	
	@Column(name = "DevRole")
	private String devRole;
	
	@Column(name = "DevSkill")
	private String devSkill;

}
