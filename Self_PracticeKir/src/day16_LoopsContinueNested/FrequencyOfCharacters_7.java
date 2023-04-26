package day16_LoopsContinueNested;

public class FrequencyOfCharacters_7 {
    public static void main(String[] args) {
       String str = "aabcccd";
       String res = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count =0;
            for (int j = 0; j <str.length() ; j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }
                if(!res.contains(""+ch)){
                    res+= ch+""+count;
                }
        }
        System.out.println(res);





    }
}
