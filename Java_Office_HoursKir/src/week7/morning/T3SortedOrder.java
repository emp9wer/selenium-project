package week7.morning;

public class T3SortedOrder {
    public static void main(String[] args) {

        System.out.println(isSorted("abcd"));
        System.out.println(isSorted("abznm"));

    }


    public static boolean isSorted(String str){
    str = str.toLowerCase();
    for(int i = 0; i < str.length()-1; i++){
        if(str.charAt(i)> str.charAt(i+1)){
            return false;
        }
    }
    return true;
    }
}
