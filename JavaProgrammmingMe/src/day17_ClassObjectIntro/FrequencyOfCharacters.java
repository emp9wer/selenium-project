package src.day17_ClassObjectIntro;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "kaabcccd"; // aaaabbbsstt // aabcccd
        //            01234567
        String result = "";

        for (int j = 0; j < str.length(); j++) { // iterates for amount of indexes in given word
            char ch = str.charAt(j); //char in each iteration of outer loop
            int count = 0;
            for (int i = 0; i <str.length() ; i++) {
                if(str.charAt(i) == ch){ // ch is a // i is a a b c c c d   //// a a
                    count++; // 2
                }
            }
            if(result.contains(""+ch)){ // if the character already in the result
               continue; // skip that character
            }
            result += ch +""+ count; // a2
        }
        System.out.println(result);
 // k1a2


    }

}
