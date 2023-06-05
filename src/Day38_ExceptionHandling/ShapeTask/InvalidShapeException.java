package Day38_ExceptionHandling.ShapeTask;

public class InvalidShapeException extends RuntimeException{
    public InvalidShapeException(String message) {
        super(message);
    }
}
