package cda.java.exercice2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FibTest {

    // Tests pour Range = 1
    @Test
    public void FibSerieNotEmpty() {
        // Arrange
        Fib fib = new Fib(1);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertFalse(result.isEmpty());
    }

    @Test
    public void FibSerie_WhenRange_1() {
        // Arrange
        Fib fib = new Fib(1);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertEquals(1, result.size());
    }

    @Test
    public void FibSeries_WhenRange1_FirstElement() {
        // Arrange
        Fib fib = new Fib(1);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertEquals(Integer.valueOf(0), result.get(0));
    }

    // Tests pour Range = 6
    @Test
    public void FibSeries_WhenRange6_Contains3() {
        // Arrange
        Fib fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertTrue(result.contains(3));
    }

    @Test
    public void FibSeries_WhenRange6_Size() {
        // Arrange
        Fib fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertEquals(6, result.size());
    }

    @Test
    public void FibSeries_WhenRange6_DoesNotContain4() {
        // Arrange
        Fib fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertFalse(result.contains(4));
    }

    @Test
    public void FibSeries_WhenRange6_ExpectedList() {
        // Arrange
        Fib fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        List<Integer> expectedList = Arrays.asList(0, 1, 1, 2, 3, 5);
        Assert.assertEquals(expectedList, result);
    }

    @Test
    public void FibSeries_WhenRange6_IsSorted() {
        // Arrange
        Fib fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        List<Integer> sortedList = result;
        Collections.sort(sortedList);

        Integer[] originalArray = result.toArray(new Integer[0]);
        Integer[] sortedArray = sortedList.toArray(new Integer[0]);

        Assert.assertArrayEquals(sortedArray, originalArray);
    }
}
