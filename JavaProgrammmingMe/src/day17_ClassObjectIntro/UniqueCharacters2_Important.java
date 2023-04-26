package src.day17_ClassObjectIntro;

public class UniqueCharacters2_Important {
    public static void main(String[] args) {

        String str = "aabcccd";
        String unique = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int frequency = 0;
            for (int i = 0; i <str.length() ; i++) { //check how many times ch appeared it this string
                if(str.charAt(i) == ch){ // if the ch has appeared in string
                    frequency++;
                }
            }
            if (frequency == 1){ // if the frequency == to 1  then char is unique
                unique += ch;
            }
        }

        System.out.println(unique);




    }
}
