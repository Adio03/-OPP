package exceptionClass;

public class AgeLessThanZeroException extends Exception{
    public AgeLessThanZeroException(){}

    public AgeLessThanZeroException(String message){
        super(message);
    }
    public AgeLessThanZeroException(Throwable cause){
        super(cause);
    }
    public AgeLessThanZeroException(Throwable cause,String message){
super(message, cause);
    }
}

