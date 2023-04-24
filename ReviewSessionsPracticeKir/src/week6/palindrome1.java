package week6;

public class palindrome1 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("anna"));
        System.out.println(isPalindrome2("anna"));
        System.out.println(countInString("hifafasfhihih"));//3
    }
//efficient way ( warning - could be a interview question )
    public static boolean isPalindrome(String str) {     // apple

        for (int begin = 0, end = str.length() - 1; begin < str.length() / 2; begin++, end--) {

            if (str.charAt(begin) != str.charAt(end)) { // the chars are different
                return false; // exits loop returns false
            }
        }
        return true; // exits loop otherwise and returns true
    }

    public static boolean isPalindrome2(String str){
            String rev ="";
        for (int i = str.length()-1; i >=0 ; i--) {
            rev+= str.charAt(i);
        }
        if(rev.equals(str)){
            return true;
        }else {
            return false;
        }
    }


    // methot to count how many "hi" in a String

    public static int countInString(String str){
        int count = 0;

        for (int i = 0; i < str.length()-1; i++) {// length-1 to prevent out of bounds
            if (str.charAt(i)=='h' && str.charAt(i+1) == 'i'){ // way to find "hi" in string
                count++;
            }
        }
        return count;//3
    }


}