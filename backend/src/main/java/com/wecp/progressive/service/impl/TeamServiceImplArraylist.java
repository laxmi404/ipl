package com.wecp.progressive.service.impl;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.TeamService;
 
public class TeamServiceImplArraylist  implements TeamService{
    private List<Team> teams;
    public TeamServiceImplArraylist()
    {
    this.teams = new ArrayList<>();
   }
 
    @Override
    public List<Team> getAllTeams() {
        return new ArrayList<>(teams);
       
    }
 
    @Override
    public int addTeam(Team team) {
        teams.add(team);
        return teams.size();
     
       
    }
 
    @Override
    public List<Team> getAllTeamsSortedByName() {
        List<Team> sortedTeams = new ArrayList<>(teams);
        Collections.sort(sortedTeams);
        return sortedTeams;
       
    }
    @Override public void emptyArrayList()
    {
        this.teams = new ArrayList<>();
    }
   
   
 
 
}
 