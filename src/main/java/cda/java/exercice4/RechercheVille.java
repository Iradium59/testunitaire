package cda.java.exercice4;

import cda.java.exception.NotFoundException;

import java.util.List;

import java.util.List;
import java.util.stream.Collectors;

public class RechercheVille {

    private List<String> villes = List.of(
            "Paris", "Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver",
            "Amsterdam", "Vienne", "Sydney", "New York", "Londres", "Bangkok",
            "Hong Kong", "Dubaï", "Rome", "Istanbul"
    );

    public List<String> rechercher(String mot) throws NotFoundException {
        if (mot.length() < 2) {
            throw new NotFoundException();
        }

        return villes.stream()
                .filter(ville -> ville.toLowerCase().contains(mot.toLowerCase()))
                .collect(Collectors.toList());
    }
}

