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
        if (!lastFrame && !rolls.isEmpty() && (rolls.get(0).getPins() == 10 || rolls.size() == 2)) {
            return false;
        }

        if (lastFrame && rolls.size() == 2 && rolls.get(0).getPins() == 10) {
        } else if (lastFrame && rolls.size() >= 3) {

            return false;
        }

        int availablePins = 10;

        if (!rolls.isEmpty()) {
            availablePins = 10 - rolls.stream().mapToInt(Roll::getPins).sum();
        }

        int pinsKnockedDown = generateur.randomPin(availablePins);
        Roll roll = new Roll(pinsKnockedDown);
        rolls.add(roll);

        score += pinsKnockedDown;
        return true;
    }


    public int getScore() {
        return this.score;
    }
}
