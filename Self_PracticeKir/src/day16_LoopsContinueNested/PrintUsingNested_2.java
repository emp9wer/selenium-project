package src.day16_LoopsContinueNested;

public class PrintUsingNested_2 {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {
            System.out.println();
            for ( char j = 'a'; j <= 'z' ; j++) {
                System.out.print(i+""+j+" ");
            }
        }
    }
}
