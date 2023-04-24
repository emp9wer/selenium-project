package Self_PracticeKir.day14_forLoops;

public class numberEvenOdd {
    public static void main(String[] args) {

/*
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int j = 1; j <= 20; j++) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
        }
*/
        String even ="";
        String odd="";
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                even+=" " + i;
            }else{
                odd+= " " +i;
            }
        }
        System.out.println(even +"\n"+odd);
    }

}
