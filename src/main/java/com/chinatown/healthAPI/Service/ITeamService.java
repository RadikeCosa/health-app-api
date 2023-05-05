package com.chinatown.healthAPI.Service;

import com.chinatown.healthAPI.Model.Team;

import java.util.List;

public interface ITeamService {

     List<Team> getTeam ();

     void saveTeam (Team team);

     void deleteTeam (Long id);

     Team findTeam (Long id);
}
