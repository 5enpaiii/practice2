package pr22;

public class DivByZeroException extends Exception {

    public DivByZeroException(String message) {
        super("My hitted message " + message);
    }

    public DivByZeroException() {}
}
