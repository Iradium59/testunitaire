package cda.java.exercice2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FibTest {

    @Test
    public void testGetFibSeriesWithRange1() {
        // Arrange
        Fib fib = new Fib(1);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertFalse(result.isEmpty());

        Assert.assertEquals(1, result.size());
        Assert.assertEquals(Integer.valueOf(0), result.get(0));
    }

    @Test
    public void testGetFibSeriesWithRange6() {
        // Arrange
        Fib fib = new Fib(6);  // Range de 6

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertTrue(result.contains(3));

        Assert.assertEquals(6, result.size());

        Assert.assertFalse(result.contains(4));

        List<Integer> expectedList = Arrays.asList(0, 1, 1, 2, 3, 5);
        Assert.assertEquals(expectedList, result);

        List<Integer> sortedList = result;
        Collections.sort(sortedList);

        Integer[] originalArray = result.toArray(new Integer[0]);
        Integer[] sortedArray = sortedList.toArray(new Integer[0]);

        Assert.assertArrayEquals(sortedArray, originalArray);
    }
}
