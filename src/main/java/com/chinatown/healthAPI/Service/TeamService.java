package com.chinatown.healthAPI.Service;

import com.chinatown.healthAPI.Model.Team;
import com.chinatown.healthAPI.Repository.ITeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService implements ITeamService{

    @Autowired
    private ITeamRepository iTeamRepository;


    @Override
    public List<Team> getTeam() {
        return iTeamRepository.findAll();
    }

    @Override
    public void saveTeam(Team team) {
        iTeamRepository.save(team);
    }

    @Override
    public void deleteTeam(Long id) {
        iTeamRepository.deleteById(id);
    }

    @Override
    public Team findTeam(Long id) {
        return iTeamRepository.findById(id).orElse(null);
    }
}
