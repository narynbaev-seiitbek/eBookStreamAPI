package eBookStreamAPI;

public class InvalidPercentException extends RuntimeException{

    public InvalidPercentException() {
    }

    public InvalidPercentException(String message) {
        super(message);
    }
}
