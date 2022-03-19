package task.exception;

public class DatabaseRepositoryException extends RuntimeException {
    public DatabaseRepositoryException(String message, Throwable cause) {
        super(message, cause);
    }

}
