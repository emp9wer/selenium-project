package src.day38_exceptionsHandlings;

class CustomCheckedException extends Exception{

}
class CustomUncheckedException extends RuntimeException{

}

public class CustomExceptions {

    public static void main(String[] args) {
        System.out.println("---------CustomCheckedException----------");
        try {
            throw new CustomCheckedException();
        } catch (CustomCheckedException e) {
            e.printStackTrace();
        }

        System.out.println("---------CustomUncheckedException----------");
        throw new CustomUncheckedException();

    }

}
