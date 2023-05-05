package com.chinatown.healthAPI.Controller;

import com.chinatown.healthAPI.Model.Team;
import com.chinatown.healthAPI.Service.ITeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT })
public class TeamController {

    @Autowired
    private ITeamService iTeamService;

    @GetMapping("/api/v1/team")
    public List<Team> getTeam() { return iTeamService.getTeam();}

    @PostMapping("api/v1/team")
    public String createTeam(@RequestBody Team team){
        iTeamService.saveTeam(team);
        return "el miembro del equipo fue correctamente creado";
    }

    @DeleteMapping("/api/v1/team/{id}")
    public String deleteTeam (@PathVariable Long id){
        iTeamService.deleteTeam((id));
        return "el team member fue despiadadamente eliminado";
    }

    @PutMapping("/api/v1/team/{id}")
    public Team editTeam (@PathVariable Long id,
                          @RequestParam("name") String newName,
                          @RequestParam("lastName") String newLastName,
                          @RequestParam("rol") String newRol,
                          @RequestParam("phone") String newPhone,
                          @RequestParam("isActive") Boolean newIsActive){

        Team team = iTeamService.findTeam(id);
        team.setName(newName);
        team.setLastName(newLastName);
        team.setRol(newRol);
        team.setPhone(newPhone);
        team.setIsActive(newIsActive);

        return team;
    }
}
