package src.day20_forEachArrayContinue;

import java.util.Arrays;

public class repl {
    public static void main(String[] args) {
            String[] arr = {"6", "a", "d", "a", "a", "a", "d"};

int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);




    }
}
