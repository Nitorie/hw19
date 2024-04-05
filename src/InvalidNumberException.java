public class InvalidNumberException extends RuntimeException {

    public InvalidNumberException() {
        super("This number is incorrect");
    }
    public InvalidNumberException(String message) {
        super(message);
    }

}
