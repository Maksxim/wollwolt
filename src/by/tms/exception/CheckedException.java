package by.tms.exception;

public class CheckedException extends Exception {


    public CheckedException(String message) {
        super(message);
    }

    public CheckedException(Throwable cause) {
        super(cause);
    }
}
