package day13_Custom_methods_continue;

public class Title_7 {
    public static void main(String[] args) {
        System.out.println(title("daFAfafasfgSD"));


    }


    public static String title(String word){

        return word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();

    }
}
