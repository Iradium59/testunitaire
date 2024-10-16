package cda.java.exercice1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GradingCalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "95, 90, A",
            "85, 90, B",
            "65, 90, C",
            "95, 65, B",
            "95, 55, F",
            "65, 55, F",
            "50, 90, F"
    })
    public void testMultipleInputs(int score, int presence, char expectedGrade) {
        // Arrange
        GradingCalculator gradingCalculator = new GradingCalculator(score, presence);

        // Act
        char result = gradingCalculator.getGrade();

        // Assert
        Assert.assertEquals(expectedGrade, result);
    }
}
