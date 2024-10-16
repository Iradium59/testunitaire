package cda.java.exercice3;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class DiceScoreTest {

    @Test
    public void testIdenticalDice_ScoreCalculation() {
        // Arrange
        Ide deMock = Mockito.mock(Ide.class);
        Mockito.when(deMock.getRoll()).thenReturn(4);
        DiceScore diceScore = new DiceScore(deMock);

        // Act
        int score = diceScore.getScore();

        // Assert
        Assert.assertEquals(18, score);
    }

    @Test
    public void testIdenticalSixes_ReturnsThirty() {
        // Arrange
        Ide deMock = Mockito.mock(Ide.class);
        Mockito.when(deMock.getRoll()).thenReturn(6);
        DiceScore diceScore = new DiceScore(deMock);

        // Act
        int score = diceScore.getScore();

        // Assert
        Assert.assertEquals(30, score);
    }

    @Test
    public void testDifferentDice_HighestValueReturned() {
        // Arrange
        Ide deMock = Mockito.mock(Ide.class);
        Mockito.when(deMock.getRoll()).thenReturn(3, 5);
        DiceScore diceScore = new DiceScore(deMock);

        // Act
        int score = diceScore.getScore();

        // Assert
        Assert.assertEquals(5, score);
    }
}
