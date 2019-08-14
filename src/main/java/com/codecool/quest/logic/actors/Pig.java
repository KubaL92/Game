package com.codecool.quest.logic.actors;

import com.codecool.quest.logic.Cell;


public class Pig extends Actor {
    public Pig(Cell cell) {
        super(cell);
    }

    @Override
    public String getTileName() {
        return "pig";
    }
}
