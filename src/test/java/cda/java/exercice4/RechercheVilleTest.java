package cda.java.exercice4;

import cda.java.exception.NotFoundException;
import org.junit.Assert;
import org.junit.Test;

public class RechercheVilleTest {

    @Test
    public void rechercheWhenStringContains_1Character_ThenThrowNotFoundException() {
        // Arrange
        RechercheVille rechercheVille = new RechercheVille();

        // Act & Assert
        Assert.assertThrows(NotFoundException.class, () -> rechercheVille.rechercher("p"));
    }
}
