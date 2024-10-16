package cda.java.exception;

public class DivisionByZeroException extends RuntimeException{
    public DivisionByZeroException() {
        super("Division par zéro");
    }
}
