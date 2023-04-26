package src.day16_LoopsContinue;

public class NestedLoopPracticeFreqOfCharacters {
    public static void main(String[] args) {

        String str = "aaabbccccddeeeeff";
        String result = "" ; // "bdf" // appeared twice

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // each character of string str
            int count = 0;

            for (int i = 0; i < str.length(); i++) { // comparing ch to each character of string str
                if(str.charAt(i) == ch){
                    count++;
                }
            }
         //   if(!result.contains(""+ch))  // a3b2c4d2e4f2
                if(count == 2 && !result.contains(""+ch)){ // avoids duplicates in result
                    result+=ch + "" +count;
                }

        }
        System.out.println(result);

    }
}
