package src.day14_forLoops;

public class QofDay {
    public static void main(String[] args) {
        String fullName = "   chuck norris    ";  // C.N.
        fullName = fullName.toUpperCase().trim(); //
        fullName = "" + fullName.charAt(0)+"."+fullName.charAt(fullName.indexOf(" ")+1)+".";
        System.out.println(fullName);

    }
}
