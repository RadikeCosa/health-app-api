package com.chinatown.healthAPI.Repository;

import com.chinatown.healthAPI.Model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeamRepository extends JpaRepository<Team, Long> {
}
