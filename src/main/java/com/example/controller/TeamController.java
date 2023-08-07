package com.example.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.TeamDao;
import com.example.dao.TeamDaoImp;
import com.example.model.Team;


@RestController
public class TeamController {

    private TeamDao teamDao = new TeamDaoImp();

    @PostMapping("/team")
    public ResponseEntity<Team> createTeam(@RequestBody Team possibleTeam){
        Team createdTeam = this.teamDao.createTeam(possibleTeam.getTeamName());
        return new ResponseEntity<Team>(createdTeam, HttpStatus.CREATED);
    }

    @GetMapping("/team/{name}")
    public ResponseEntity<Team> getTeam(@PathVariable String name){
        return new ResponseEntity<Team>(this.teamDao.selectTeam(name), HttpStatus.OK);
    }
}