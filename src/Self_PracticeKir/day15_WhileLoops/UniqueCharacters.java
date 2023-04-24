package Self_PracticeKir.day15_WhileLoops;

public class UniqueCharacters {
    public static void main(String[] args) {
        String word = "ABACCD"; // BD
        String res = "";
        for (int i =1 ; i < word.length(); i++) {
              if(!((word.substring(i+1).contains(""+word.charAt(i)))
              || (word.substring(0,i).contains(""+word.charAt(i))))){
                  res += word.charAt(i);
              }
        }
        System.out.println(res);

    }
}
