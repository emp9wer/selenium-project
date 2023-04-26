package src.day11_string;

public class StringMethods1 {
    public static void main(String[] args) {
        System.out.println("------------------- .toLowerCase() ----------------------");
        String str1 = "CYDEO SCHOOL";

        str1 = str1.toLowerCase(); // "cydeo school"
        System.out.println(str1);
        System.out.println("------------------ .toUpperCase() -------------------");

        String str2 = "cydeo school";

        str2 = str2.toUpperCase(); // "CYDEO SCHOOL"

        System.out.println(str2);

        System.out.println("------------------- assigning ------------------------");

        String word = "Wooden Spoon";

        word = word.toUpperCase();  //  "WOODEN SPOON"

        word = word.toLowerCase(); // "wooden spoon"

        System.out.println(word); // wooden spoon

        System.out.println("--------------------- .trim() ------------------------");

        String str4 = "              Cydeo School";

        str4 = str4.trim(); //"Cydeo School"

        System.out.println(str4); // Cydeo School

        System.out.println("-----------------------.IndexOf()-----------------------");
        String sentence1 = "Today is Sunday, and we hava Java Class";
        int index1 = sentence1.indexOf('w');

        System.out.println(index1); // 21 index number

        System.out.println("--------find index in between--.indexOf(\"aSc\");---------");

        String s1 = "I Love Java Programming";
        int firstA = s1.indexOf('a');
        System.out.println(firstA);      // 8 index number

        int secondA = s1.indexOf("a ");
        System.out.println(secondA);     // 10 index number ( use of sequence of "a ")

        String s2 = "Java Python JavaScript Cydeo Python";

        int a1 = s2.indexOf('a');
        System.out.println(a1);//1

        int a2 = s2.indexOf("a Python");
        System.out.println(a2);//3

        int a3 = s2.indexOf("avaS");
        System.out.println(a3);// 13

        int a4 = s2.indexOf("aSc");
        System.out.println(a4);// 15

        System.out.println("--------------.lastIndexOf('a')-//checks from right to left------------------");

        String w = "Java";

        System.out.println(w.indexOf('a')); // 1

        System.out.println(w.lastIndexOf('a')); // 3

        String w2 = "Java Python JavaScript Cydeo Python";

        System.out.println(w2.lastIndexOf('a')); // 15 //checks from right to left
        System.out.println(w2.lastIndexOf('P')); // 29 //checks from right to left

    }
}
