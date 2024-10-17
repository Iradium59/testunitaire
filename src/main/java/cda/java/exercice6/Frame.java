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
        // Si c'est une série standard et qu'un strike a été réalisé ou que deux lancers ont déjà été effectués, retournez false
        if (!lastFrame && !rolls.isEmpty() && (rolls.get(0).getPins() == 10 || rolls.size() == 2)) {
            return false;  // Strike ou déjà deux lancers dans une série standard
        }

        // Si c'est la série finale (dernier round), on permet un troisième lancer après un strike
        if (lastFrame && rolls.size() >= 3) {
            return false;  // Pas de quatrième lancer autorisé dans la dernière série
        }

        // Si c'est le premier lancer, 10 quilles disponibles
        int availablePins = 10;

        // S'il y a déjà eu des lancers, on calcule les quilles restantes (sauf si strike au premier lancer)
        if (!rolls.isEmpty() && rolls.get(0).getPins() < 10) {
            availablePins = 10 - rolls.stream().mapToInt(Roll::getPins).sum();
        }

        // Génère un nombre aléatoire de quilles renversées (maximum le nombre de quilles disponibles)
        int pinsKnockedDown = generateur.randomPin(availablePins);
        Roll roll = new Roll(pinsKnockedDown);
        rolls.add(roll);

        // Mise à jour progressive du score sans recalcul excessif
        score += pinsKnockedDown;

        // Retourne true pour indiquer que le lancer a réussi
        return true;
    }


    public int getScore() {
        return this.score;
    }
}
