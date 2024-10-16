package cda.java.demo1;

import cda.java.exception.DivisionByZeroException;

public class Calcul {

    public double addition(double x, double y) {
        return x + y;
    }

    public double division(double x, double y) {
        if (y == 0) throw new DivisionByZeroException();
        return x / y;
    }
}
