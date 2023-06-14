package src.day31_methodOverriding.studentTask;

public class a {

    public static void main(String[] args) {
        int n = 3;
       String str = "Anastasia";
        //           012345678
        //           123456789
        System.out.println(str.length()); // 9-3 = 6
        str =  str.substring(0,2)+""+str.substring(7,9); // Ania

        System.out.println(str);//Ania

    }
}
