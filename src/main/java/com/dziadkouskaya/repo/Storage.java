package com.dziadkouskaya.repo;

import com.dziadkouskaya.entity.Game;
import com.dziadkouskaya.entity.Team;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

public class Storage {
    public static Storage uniqueInstance = null;
    List<Team> teams = new ArrayList<>();
    List<Game> games = new ArrayList<>();

    private Storage() {
    }

    public static Storage getInstance() {
        if (isNull(uniqueInstance)) {
            uniqueInstance = new Storage();
        }
        return uniqueInstance;
    }
}
