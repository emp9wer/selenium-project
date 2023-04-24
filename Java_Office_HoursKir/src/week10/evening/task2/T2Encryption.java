package week10.evening.task2;

public class T2Encryption {

    public String message;
    public int modifyNumber;
    public int factoryNumber;


    public T2Encryption(String message) {
        this.message = message;
    }

    public T2Encryption(String message, int modifyNumber, int factoryNumber) {
      //  this.message = message;
        this(message);
        this.modifyNumber = modifyNumber;
        this.factoryNumber = factoryNumber;
        encrypt();
    }

    public void encrypt(){

        String encrypted="";
        for (char c : message.toCharArray()) {
            int result = (c+modifyNumber)*factoryNumber;
            encrypted+=result+" ";

        }
    }



}
