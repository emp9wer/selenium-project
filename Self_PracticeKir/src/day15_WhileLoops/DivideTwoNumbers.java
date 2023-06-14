package src.day15_WhileLoops;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        int a = 6, b = 3, c=0, answer=0; //4
        c=b;
        if (a>0 && b>0){
            while(a >= b){
            b+=c;
                answer++;
            }
        }else{
            System.err.println("value is not positive");
        }
        System.out.println(answer);
    }
}
