package src.day16_LoopsContinue;

public class FrequencyOfAChar {
    public static void main(String[] args) {

   String str = "acbacb";
   char ch = 'c';
   int count = 0;
        for (int i = 0; i < str.length(); i++) { // i index numbers of string str
            if(str.charAt(i) == ch){
                count++;
            }
        }
        System.out.println(count);

    }
}
