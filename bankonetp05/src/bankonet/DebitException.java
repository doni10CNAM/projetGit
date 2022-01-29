package bankonet;

public class DebitException extends Exception{
     String message;

    public DebitException(String message){
        super(message);
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
