package cda.java.exercice6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class FrameTest {

    private IGenerateur generateur;

    @Before
    public void setup() {
        generateur = Mockito.mock(IGenerateur.class);
    }

    @Test
    public void Roll_SimpleFrame_FirstRoll_CheckScore() {
        // Arrange
        Mockito.when(generateur.randomPin(10)).thenReturn(5);
        Frame frame = new Frame(generateur, false);

        // Act
        boolean rollResult = frame.makeRoll();

        // Assert
        Assert.assertEquals(5, frame.getScore());
    }

    @Test
    public void Roll_SimpleFrame_SecondRoll_CheckScore() {
        // Arrange
        Mockito.when(generateur.randomPin(10)).thenReturn(5);
        Mockito.when(generateur.randomPin(5)).thenReturn(3);
        Frame frame = new Frame(generateur, false);
        frame.makeRoll();

        // Act
        frame.makeRoll();

        // Assert
        Assert.assertEquals(8, frame.getScore());
    }

    @Test
    public void Roll_SimpleFrame_SecondRoll_FirstRollStrick_ReturnFalse() {
        // Arrange
        Mockito.when(generateur.randomPin(10)).thenReturn(10);
        Frame frame = new Frame(generateur, false);

        // Act
        frame.makeRoll();
        boolean rollResult = frame.makeRoll();

        // Assert
        Assert.assertFalse(rollResult);
    }
    @Test
    public void Roll_SimpleFrame_MoreRolls_ReturnFalse() {
        // Arrange
        Mockito.when(generateur.randomPin(10)).thenReturn(5);
        Frame frame = new Frame(generateur, false);

        // Act
        frame.makeRoll();
        frame.makeRoll();
        boolean rollResult = frame.makeRoll();

        // Assert
        Assert.assertFalse(rollResult);
    }

    @Test
    public void Roll_LastFrame_SecondRoll_FirstRollStrick_ReturnTrue() {
        // Arrange
        Mockito.when(generateur.randomPin(10)).thenReturn(10);
        Frame frame = new Frame(generateur, true);

        // Act
        frame.makeRoll();  // Premier lancer
        boolean rollResult = frame.makeRoll();

        // Assert
        Assert.assertTrue(rollResult);
    }

    @Test
    public void Roll_LastFrame_SecondRoll_FirstRollStrick_CheckScore() {
        // Arrange
        Mockito.when(generateur.randomPin(10)).thenReturn(10);
        Frame frame = new Frame(generateur, true);
        frame.makeRoll();

        // Act
        Mockito.when(generateur.randomPin(10)).thenReturn(5);
        frame.makeRoll();

        // Assert
        Assert.assertEquals(15, frame.getScore());
    }

    @Test
    public void Roll_LastFrame_ThirdRoll_FirstRollStrick_ReturnTrue() {
        // Arrange
        Mockito.when(generateur.randomPin(10)).thenReturn(10);
        Frame frame = new Frame(generateur, true);
        frame.makeRoll();
        frame.makeRoll();

        // Act
        boolean rollResult = frame.makeRoll();

        // Assert
        Assert.assertTrue(rollResult);
    }

    @Test
    public void Roll_LastFrame_ThirdRoll_FirstRollStrick_CheckScore() {
        // Arrange
        Mockito.when(generateur.randomPin(10)).thenReturn(10);
        Frame frame = new Frame(generateur, true);
        frame.makeRoll();
        frame.makeRoll();

        // Act
        Mockito.when(generateur.randomPin(10)).thenReturn(5);
        frame.makeRoll();

        // Assert
        Assert.assertEquals(20, frame.getScore());
    }

    @Test
    public void Roll_LastFrame_ThirdRoll_Spare_ReturnTrue() {
        // Arrange
        Mockito.when(generateur.randomPin(10)).thenReturn(5);
        Frame frame = new Frame(generateur, true);
        frame.makeRoll();

        // Act
        Mockito.when(generateur.randomPin(5)).thenReturn(5);
        frame.makeRoll();
        boolean rollResult = frame.makeRoll();

        // Assert
        Assert.assertTrue(rollResult);
    }

    @Test
    public void Roll_LastFrame_ThirdRoll_Spare_CheckScore() {
        // Arrange
        Mockito.when(generateur.randomPin(10)).thenReturn(5);
        Frame frame = new Frame(generateur, true);
        frame.makeRoll();

        // Act
        Mockito.when(generateur.randomPin(5)).thenReturn(5);
        frame.makeRoll();
        Mockito.when(generateur.randomPin(10)).thenReturn(8);
        frame.makeRoll();

        // Assert
        Assert.assertEquals(18, frame.getScore());
    }

    @Test
    public void Roll_LastFrame_FourthRoll_ReturnFalse() {
        // Arrange
        Mockito.when(generateur.randomPin(10)).thenReturn(10);
        Frame frame = new Frame(generateur, true);
        frame.makeRoll();
        frame.makeRoll();
        frame.makeRoll();

        // Act
        boolean rollResult = frame.makeRoll();

        // Assert
        Assert.assertFalse(rollResult);
    }
}
