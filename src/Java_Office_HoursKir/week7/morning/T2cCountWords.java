package Java_Office_HoursKir.week7.morning;

public class T2cCountWords {
    public static void main(String[] args) {

        System.out.println(countWords("hello abab we are studying javac"));


    }

    public static int countWords(String str){
        str=str.trim();
        int spaces =0;
        for(int i = 0; i < str.length();i++){
            if(str.charAt(i) == ' '){
                spaces++;
            }
        }
        return spaces+1;

    }
}
