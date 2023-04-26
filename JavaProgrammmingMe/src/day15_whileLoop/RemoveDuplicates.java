package src.day15_whileLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aabbbcccc";
            //        0123456789 str.length() = 9
        String result = ""; // "abc"

        for (int i = 0; i <str.length(); i++) { // i  - index numbers of str from 0
        char each = str.charAt(i); // each char of string str
        if (!result.contains("" + each)){
            result += each;
        }

        }
        System.out.println(result);

        System.out.println("-----------------------------");

        for (int i = 50; i < 101; i++) {
            if(i%2 !=0){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("-----------------------------");

        while(true){
            System.out.println("Hello while loop");
        }



    }



}
