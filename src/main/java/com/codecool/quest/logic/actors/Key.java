package com.codecool.quest.logic.actors;

import com.codecool.quest.logic.Cell;


public class Key extends Actor {
    public Key(Cell cell) {
        super(cell);
    }

    @Override
    public String getTileName() {
        return "key";
    }
}