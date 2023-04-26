package day14_forLoops;

public class FrequencyOfWordLoop {
    public static void main(String[] args) {
        System.out.println(frequencyOfWord("Javac java jAvA javac java", "java"));
    }
    public static int frequencyOfWord(String s, String w) {
        int count = 0;
        int senLength = s.length();
        s= s.replace(" ", "  ");
        s = " " + s + " ";
        w = " " + w + " ";
        s = s.toLowerCase();
        w = w.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.contains(w)) {
                s = s.replaceFirst(w, "");
                count += 1;
            }
        }
        return count;
    }
}
/*
6. Create a method named frequencyOfWord that takes two arguments:
            1. sentence (String)
            2. word (String)

    The method should return the frequency of the word from the sentence

        Ex:
            frequencyOfWord("Java java jAvA", "java")  ==> 4
 */