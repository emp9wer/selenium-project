package src.day15_whileLoop;

public class BreakStatement {


    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            if(i==6){ //if i value reaches 6
                break; //exits loop
            }
            System.out.print(i);
        }
        System.out.println();
        System.out.println("-------------------------------------");

        for(char i = 'A' ; i <='Z' ; i++){
            System.out.print(i);
            if(i =='J'){
                break; // breaks after 'J' is printed!
            }
        }
        System.out.println();
        System.out.println("--------------------------------------");

        for (;;){
            System.out.println("hello");
            break;
        }

















    }


}
