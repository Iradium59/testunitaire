package cda.java.demo2;

public class Jeu {
    private final Ide de;

    public Jeu(Ide de) {
        this.de = de;
    }

    public boolean jouer(){
        return de.lancer() == 7;
    }
}
