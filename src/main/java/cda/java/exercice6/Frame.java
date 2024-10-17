package cda.java.exercice6;

import java.util.List;

public class Frame {
    private int score;
    private boolean lastFrame;
    private IGenerateur generateur;
    private List<Roll> rolls;

    public Frame(IGenerateur generateur, boolean lastFrame) {
        this.lastFrame = lastFrame;
        this.generateur = generateur;
    }

    public boolean makeRoll(){
        return false;
    }

    public int getScore() {
        return 0;
    }
}
