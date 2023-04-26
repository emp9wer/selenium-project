package src.week6.evening;

public class T3Syllables {
    public static void main(String[] args) {
        int result = getNumberOfSyllables("");
        System.out.println(result);
    }
    public static int getNumberOfSyllables(String word) {
int dashcounter =0;
        if (!word.isEmpty()) {
            for (int i = 0; i <word.length() ; i++) {
                char each = word.charAt(i);
                if (each== '-'){
                    dashcounter++;
                }
            }
            return dashcounter+1;
        } else {
            return dashcounter;
        }
    }
}
