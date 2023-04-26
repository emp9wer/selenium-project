package src.day15_whileLoop;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
String str = "xyzxyzxyz";
String res ="";
        for (int i = 0; i <str.length() ; i++) {

            if (res.contains(""+str.charAt(i)))
                continue;
            res += str.charAt(i);
        }
        System.out.println(res);
    }
}
