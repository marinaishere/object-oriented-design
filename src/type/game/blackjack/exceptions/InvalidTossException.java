package type.game.blackjack.exceptions;

public class InvalidTossException extends RuntimeException {
    public InvalidTossException() {
        this("Cannot make this toss!");
    }

    public InvalidTossException(String message) {
        super(message);
    }
}
