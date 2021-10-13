package com.ocp4.s2i.template.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ocp4.s2i.template.api.model.Team;

/**
 * 
 * @author malam84
 *
 */

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

}
