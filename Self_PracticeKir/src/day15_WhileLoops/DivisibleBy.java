package src.day15_WhileLoops;

public class DivisibleBy {
    public static void main(String[] args) {
        int a = 1, b =100;
        String divBy15 = "Divisible By 15:";
        String divBy5 = "Divisible By 5:";
        String divBy3 = "Divisible By 3:";

        for (int i = a; i <= b; i++) {
            if ((i%15==0)){
                divBy15 += " "+i;
            }else if (i%3==0){
                divBy3 += " "+i;
            } else if (i%5==0){
                divBy5 += " "+i;

            }
        }
        System.out.println(divBy15 + "\n" + divBy5 + "\n" + divBy3);

    }
}
