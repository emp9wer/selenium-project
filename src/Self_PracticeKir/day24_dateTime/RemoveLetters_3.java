package Self_PracticeKir.day24_dateTime;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLetters_3 {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

        list.removeIf(p -> p.isLetter(p));
        System.out.println(list); //[$, 1, 2, @, !, 3, 4]




    }
}
/*
3. Write a program that can remove all the letters from an arrayList of characters
		ex:
			list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			['$',  '1', '2', '@', '!', '3', '4']
 */