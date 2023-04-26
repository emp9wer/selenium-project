package day13_Custom_methods_continue;

public class FrequencyOfWord_6 {
    public static void main(String[] args) {
        System.out.println(frequencyOfWord("JavA is a great language Java is awesome hello jaVa java" , "java"));
        System.out.println(frequencyOfWord1("JavA is a great language Java is awesome hello jaVa java" , "java"));
        System.out.println(frequencyOfWord2("JavA is a great language Java is awesome hello jaVa java" , "java"));
    }
    public static int frequencyOfWord(String sentence, String word){
        sentence= sentence.toLowerCase().trim();
        word= word.toLowerCase().trim();
        int c = sentence.length() - sentence.replace (word, (word.substring(0 , word.length()-1))).length();
        return c;
    }
    public static int frequencyOfWord1 (String sentence, String word){
        sentence= sentence.toLowerCase();
        word = word.toLowerCase();
        sentence = sentence.replace(" ", "");
        return (sentence.length() - (sentence.replace(word , "").length() )) /word.length() ;
    }

      public static int frequencyOfWord2( String sentence, String word){

        sentence = sentence.toLowerCase(); word=word.toLowerCase();
        int n=0;
        if(sentence.contains(word)){
            n++;
            sentence = sentence.substring(sentence.indexOf(word)+(word.length()));

            n+= frequencyOfWord(sentence,word);
            return n;
        }
        return 0;
    }
}
/**
6. Create a method named frequencyOfWord that takes two arguments:
            1. sentence (String)
            2. word (String)

    The method should return the frequency of the word from the sentence

        Ex:
            frequencyOfWord("Java java jAvA", "java")  ==> 4

 */