package cda.java.exercice1;

import org.junit.Assert;
import org.junit.Test;

public class GradingCalculatorTest {

    @Test
    public void when_score_95_presence_90() {
        // Arrange
        GradingCalculator gradingCalculator = new GradingCalculator(95, 90);

        // Act
        char result = gradingCalculator.getGrade();

        // Assert
        Assert.assertEquals('A', result);
    }

    @Test
    public void when_score_85_presence_90() {
        // Arrange
        GradingCalculator gradingCalculator = new GradingCalculator(85, 90);

        // Act
        char result = gradingCalculator.getGrade();

        // Assert
        Assert.assertEquals('B', result);
    }

    @Test
    public void when_score_65_presence_90() {
        // Arrange
        GradingCalculator gradingCalculator = new GradingCalculator(65, 90);

        // Act
        char result = gradingCalculator.getGrade();

        // Assert
        Assert.assertEquals('C', result);
    }

    @Test
    public void when_score_95_presence_65() {
        // Arrange
        GradingCalculator gradingCalculator = new GradingCalculator(95, 65);

        // Act
        char result = gradingCalculator.getGrade();

        // Assert
        Assert.assertEquals('B', result);
    }

    @Test
    public void when_score_95_presence_55() {
        // Arrange
        GradingCalculator gradingCalculator = new GradingCalculator(95, 55);

        // Act
        char result = gradingCalculator.getGrade();

        // Assert
        Assert.assertEquals('F', result);
    }

    @Test
    public void when_score_65_presence_55() {
        // Arrange
        GradingCalculator gradingCalculator = new GradingCalculator(65, 55);

        // Act
        char result = gradingCalculator.getGrade();

        // Assert
        Assert.assertEquals('F', result);
    }

    @Test
    public void when_score_50_presence_90() {
        // Arrange
        GradingCalculator gradingCalculator = new GradingCalculator(50, 90);

        // Act
        char result = gradingCalculator.getGrade();

        // Assert
        Assert.assertEquals('F', result);
    }
}
