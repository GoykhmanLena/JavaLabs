package customException;

public class SwearingException extends RuntimeException {
    private final int invalidIndex;

    public SwearingException(String message, int invalidIndex) {
        super(message);
        this.invalidIndex = invalidIndex;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " Неверный индекс: " + invalidIndex;
    }
}
