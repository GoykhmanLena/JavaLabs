package customException;

public class PossibilityException extends RuntimeException{
    public PossibilityException(String message){
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
