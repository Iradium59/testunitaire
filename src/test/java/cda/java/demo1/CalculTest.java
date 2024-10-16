package cda.java.demo1;

import cda.java.exception.DivisionByZeroException;
import org.junit.Assert;
import org.junit.Test;

public class CalculTest {

    @Test
    public void whenAddition_1_2_then_3(){
        // Arrange
        Calcul calcul = new Calcul();
        double x = 1;
        double y = 2;

        // Act
        double result = calcul.addition(x, y);

        // Assert
        Assert.assertEquals(3, result, 0);
    }

    @Test
    public void whenDivision_30_10_then_3(){
        // Arrange
        Calcul calcul = new Calcul();
        double x = 30;
        double y = 10;

        // Act Assert
        Assert.assertEquals(3, calcul.division(x, y), 0);
    }
}
