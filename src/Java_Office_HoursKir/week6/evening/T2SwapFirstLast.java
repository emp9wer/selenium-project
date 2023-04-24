package Java_Office_HoursKir.week6.evening;

public class T2SwapFirstLast {
    public static void main(String[] args) {
        String result = swapFirstWithLast("code");
        System.out.println(result);
    }
    private static String swapFirstWithLast(String word) {

        //get the first letter
        char first = word.charAt(0);

        //get last letter
        char last = word.charAt(word.length() - 1);

        //we will get the between first and last letter
        String sub = word.substring(1, word.length() - 1);

        // i will put inside the another variable
        String result = last + sub + first;

        //i will return

    return result;
    }


}
