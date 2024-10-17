package cda.java.exception;

public class NotFoundException extends RuntimeException{

    public NotFoundException() {
        super("La ville n'a pas été trouvée");
    }
}
