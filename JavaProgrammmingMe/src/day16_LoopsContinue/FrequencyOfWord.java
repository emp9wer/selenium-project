package src.day16_LoopsContinue;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String sentence = "java java java java";
        String word = "java";
        int count =0;
        sentence.toLowerCase();
        word.toLowerCase();
        while (sentence.contains(word)){
           sentence = sentence.replaceFirst(word, ""); // use of replaceFirst
                    count++; //increases by one every time word removed from sentence
        }
        System.out.println(count);
    }
}
