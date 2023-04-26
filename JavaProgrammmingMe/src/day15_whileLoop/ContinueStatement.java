package src.day15_whileLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            if(i==2){ // when condition is met it skips
                continue;
            }
            System.out.print(i); // 1 2 3 4 5
        }
        System.out.println();
        System.out.println("------------------------");

        for (int i = 10; i < 21; i++) {
                if(i%2 == 0){
                    continue;
                }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("----------------------");

     for (char i = 'A'; i <= 'G'; i++) {
         if(i == 'B' || i == 'E') {continue;}
         System.out.println(i);
        }

        for (int i = 0; i < 10; i++)
            System.out.println("Hello World"); // x10      // not good practice to not have {}
        System.out.println("ssssss"); // x1



    }
}
