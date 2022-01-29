package bankonet;

public class CrediterException extends Exception{

    String message;

    public CrediterException(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
}
