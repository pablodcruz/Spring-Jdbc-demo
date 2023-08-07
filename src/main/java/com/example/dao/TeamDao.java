package com.example.dao;

import java.util.Optional;
import com.example.model.Team;

public interface TeamDao {
    Team createTeam(String name);
    Team selectTeam(String name);
    boolean deleteTeam(String name);
}
