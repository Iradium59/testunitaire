package cda.java.exercice6;

import java.util.ArrayList;
import java.util.List;

public class Frame {
    private int score;
    private boolean lastFrame;
    private IGenerateur generateur;
    private List<Roll> rolls;

    public Frame(IGenerateur generateur, boolean lastFrame) {
        this.lastFrame = lastFrame;
        this.generateur = generateur;
        this.rolls = new ArrayList<Roll>();
    }

    public boolean makeRoll() {
        int pinsKnockedDown = generateur.randomPin(10);
        Roll roll = new Roll(pinsKnockedDown);
        rolls.add(roll);

        score += pinsKnockedDown;

        return true;
    }

    public int getScore() {
        return this.score;
    }
}
