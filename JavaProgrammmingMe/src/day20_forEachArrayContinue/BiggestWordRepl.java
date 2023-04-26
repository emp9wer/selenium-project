package src.day20_forEachArrayContinue;

public class BiggestWordRepl {
    public static void main(String[] args) {
        String[] words ={"aaaaa","aaa","asddsgd","sgsgsgwtwetw235423"};

        String max = "";

        for(int i = 0; i< words.length; i++){

            if (max.length() < words[i].length()){
                max = words[i];
            }
        }
        System.out.print(max);
    }
}


