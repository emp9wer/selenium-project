package src.day38_exceptionsHandlings;

public class BreakTimeException extends RuntimeException{

    public BreakTimeException(){

        super("Its a break time");

    }

    public BreakTimeException(String message){
        super(message);
    }
}
