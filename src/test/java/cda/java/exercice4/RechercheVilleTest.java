package cda.java.exercice4;

import cda.java.exception.NotFoundException;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class RechercheVilleTest {

    @Test
    public void rechercheWhenTextContains_LessThan2Characters_ThenThrowNotFoundException() {
        // Arrange
        RechercheVille rechercheVille = new RechercheVille();

        // Act & Assert
        Assert.assertThrows(NotFoundException.class, () -> rechercheVille.rechercher("A"));
    }

    @Test
    public void rechercheWhenTextContains_2OrMoreCharacters_ThenReturnMatchingCities() {
        // Arrange
        RechercheVille rechercheVille = new RechercheVille();
        List<String> villes = List.of("Paris", "Budapest", "Valence", "Vancouver");

        // Act
        List<String> result = rechercheVille.rechercher("Va");

        // Assert
        Assert.assertEquals(List.of("Valence", "Vancouver"), result);
    }

    @Test
    public void rechercheWhenTextContains_IgnoringCase_ThenReturnMatchingCities() {
        // Arrange
        RechercheVille rechercheVille = new RechercheVille();
        List<String> villes = List.of("Paris", "Budapest", "Valence", "Vancouver");

        // Act
        List<String> result = rechercheVille.rechercher("va");

        // Assert
        Assert.assertEquals(List.of("Valence", "Vancouver"), result);
    }

    @Test
    public void rechercheWhenTextContains_PartOfCityName_ThenReturnMatchingCities() {
        // Arrange
        RechercheVille rechercheVille = new RechercheVille();
        List<String> villes = List.of("Paris", "Budapest", "Valence", "Vancouver");

        // Act
        List<String> result = rechercheVille.rechercher("ape");

        // Assert
        Assert.assertEquals(List.of("Budapest"), result);
    }

    @Test
    public void rechercheWhenTextIsAsterisk_ThenReturnAllCities() {
        // Arrange
        RechercheVille rechercheVille = new RechercheVille();
        List<String> villes = List.of("Paris", "Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver", "Amsterdam", "Vienne", "Sydney", "New York", "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul");

        // Act
        List<String> result = rechercheVille.rechercher("*");

        // Assert
        Assert.assertEquals(villes, result);
    }
}
