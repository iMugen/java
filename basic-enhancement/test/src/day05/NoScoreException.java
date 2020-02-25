package day05;

/**
 * @author Jin
 * @date 2018/10/11 - 22:56
 */
public class NoScoreException extends RuntimeException {
    public NoScoreException() {
    }

    public NoScoreException(String message) {
        super(message);
    }
}
