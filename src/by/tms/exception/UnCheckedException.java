package by.tms.exception;

public class UnCheckedException extends RuntimeException{

    public UnCheckedException(String message) {
        super(message);
    }

    public UnCheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnCheckedException(Throwable cause) {
        super(cause);
    }
}
