package com.example.model;

import org.springframework.stereotype.Component;

@Component
public class Team {
    private int teamId;
    private String teamName;
    
    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public String toString() {
        return "Team [teamId=" + teamId + ", teamName=" + teamName + "]";
    }

    public Team(){}; 

    public Team(int teamId, String teamName) {
        this.teamId = teamId;
        this.teamName = teamName;
    }
}
