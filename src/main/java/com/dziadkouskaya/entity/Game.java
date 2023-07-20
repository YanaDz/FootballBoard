package com.dziadkouskaya.entity;

import lombok.Data;

@Data
public class Game {
    private int id;
    private Team homeTeam;
    private Team awayTeam;
    private int homeTeamScope;
    private int awayTeamScope;
    private int gameCommonScope;
}
