package Self_PracticeKir.day16_LoopsContinueNested;

public class PrintUsingNestedLoop_1 {
    public static void main(String[] args) {
     /*   String a = "*";
        String b = "* * * * * * * * * *";
               for (int i = 0; i < b.replace(" ", "").length(); i++) {
                System.out.println(a);
                   while (!(a.equals("* * * * * * * * * *"))){
                       a += " *";
                       break;
                   }
            } */
        String a = "*";
        for (int i = 0; i < 10; i++) {
            System.out.println(a);
            while (!(a.equals("* * * * * * * * * *"))){
                a += " *";
                break;
            }
        }
    }
}
/*
1. Use a nested loop to print the following shape

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
 */