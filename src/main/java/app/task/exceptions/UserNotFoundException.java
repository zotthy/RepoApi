package app.task.exceptions;

public class UserNotFoundException extends RuntimeException{
    private final int codeError;
    public UserNotFoundException(String msg,int codeError){
        super(msg);
        this.codeError = codeError;
    }

    public int getCodeError() {
        return codeError;
    }
}
