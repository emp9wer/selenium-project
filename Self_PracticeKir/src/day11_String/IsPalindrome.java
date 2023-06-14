package src.day11_String;
public class IsPalindrome {
    public static void isPalindrome (String a){
        String b ="";
        for (int i = a.length()-1 ; i>=0; i--){
            b+=""+a.charAt(i);
        }
        System.out.println(b);
        if(a.equals(b)){
            System.out.println("is Palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
    public static void main(String[] args) {
        isPalindrome("java");
        isPalindrome("level");
    }
}
