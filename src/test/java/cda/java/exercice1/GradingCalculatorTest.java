package cda.java.exercice1;

import org.junit.Assert;
import org.junit.Test;

public class GradingCalculatorTest {

    @Test
    public void when_score_95_presence_90(){
        // Arrange
        GradingCalculator gradingCalculator = new GradingCalculator();
        double score = 95;
        double presence = 90;

        // Act
        String result = gradingCalculator.getGrade(score, presence);

        // Assert
        Assert.assertEquals("A", result);
    }

    @Test
    public void when_score_85_presence_90(){
        // Arrange
        GradingCalculator gradingCalculator = new GradingCalculator();
        double score = 85;
        double presence = 90;

        // Act
        String result = gradingCalculator.getGrade(score, presence);

        // Assert
        Assert.assertEquals("B", result);
    }

    @Test
    public void when_score_65_presence_90(){
        // Arrange
        GradingCalculator gradingCalculator = new GradingCalculator();
        double score = 65;
        double presence = 90;

        // Act
        String result = gradingCalculator.getGrade(score, presence);

        // Assert
        Assert.assertEquals("C", result);
    }

    @Test
    public void when_score_95_presence_65(){
        // Arrange
        GradingCalculator gradingCalculator = new GradingCalculator();
        double score = 95;
        double presence = 65;

        // Act
        String result = gradingCalculator.getGrade(score, presence);

        // Assert
        Assert.assertEquals("B", result);
    }

    @Test
    public void when_score_95_presence_55(){
        // Arrange
        GradingCalculator gradingCalculator = new GradingCalculator();
        double score = 95;
        double presence = 55;

        // Act
        String result = gradingCalculator.getGrade(score, presence);

        // Assert
        Assert.assertEquals("F", result);
    }

    @Test
    public void when_score_65_presence_55(){
        // Arrange
        GradingCalculator gradingCalculator = new GradingCalculator();
        double score = 65;
        double presence = 55;

        // Act
        String result = gradingCalculator.getGrade(score, presence);

        // Assert
        Assert.assertEquals("F", result);
    }

    @Test
    public void when_score_50_presence_90(){
        // Arrange
        GradingCalculator gradingCalculator = new GradingCalculator();
        double score = 50;
        double presence = 90;

        // Act
        String result = gradingCalculator.getGrade(score, presence);

        // Assert
        Assert.assertEquals("F", result);
    }
}
