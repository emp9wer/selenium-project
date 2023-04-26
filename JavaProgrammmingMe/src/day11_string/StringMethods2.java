package src.day11_string;

public class StringMethods2 {

    public static void main(String[] args) {



        System.out.println("---------------.replace(oldValue , newValue)-----------------");
                                            //replaces all matching ones

        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";
        sentence = sentence.replace("Python","Java");
        System.out.println(sentence);//I love Java, Java is the best programming language, and Java is in high demand


        System.out.println("-----------------------replace character--------------------");
                                             //way to replace character
        String word = "Java";
        word = word.replace('a','e');
        System.out.println(word); //Jeve


        System.out.println("--------------.replaceFirst(oldValue , newValue)--------------------");
                                             // replaces first matching one
        String sentence2 = "I love Java, Java is cool";
        sentence2 = sentence2.replaceFirst("Java", "Python");
        System.out.println(sentence2); // I love Python, Java is cool


        System.out.println("--------------replace word in middle---.replaceFirst(oldValue , newValue)-----------------");

        String sentence3 = "Java is fun, Java is cool, Java is amazing";
        sentence3 = sentence3.replaceFirst(", Java",", Python");//use of unique sequence
        System.out.println(sentence3);//Java is fun, Python is cool, Java is amazing


        System.out.println("-----------------.substring()----------------");

        String sentence4 = "love Java Programming";
                        //  0123456789
                        //       5  8
     // String sub1 = sentence4.substring(5,8); // will print Jav (does not include last index)
        String sub1 = sentence4.substring(5,8+1); // will print Java
        System.out.println(sub1);

        System.out.println("----------------------------");

        String sentence5 = "Today is Sunday, tomorrow is Monday";
        String sub2 = sentence5.substring(9,15); // or 9 , 14+1
        System.out.println(sub2); // Sunday


        System.out.println("-----------use of .indexOf()  .lastIndex()-----with .substring()--------------");

        String email = "CydeoSchoolJavaProgramming@mail.ru";

        int begin = email.indexOf('@')+1;
        int end = email.lastIndexOf('.');
        String domain = email.substring(begin,end);
        System.out.println(domain); //mail
        System.out.println("------------");
        String sub5;
        System.out.println(sub5 = email.substring(email.indexOf('@')+1 , email.length()) ); //mail.ru
        System.out.println("-----------------");

        String sub6; // only first index needed in this case
        System.out.println(sub6 = email.substring(email.indexOf('@')+1));     //mail.ru
        System.out.println("-----------------");

        String sentence7 = "I love Java programming",
                sub7 = sentence7.substring(sentence7.indexOf("Java pro") , sentence7.length() );
        System.out.println(sub7);
        System.out.println("--------sentence8.substring(sentence8.indexOf(\"J\"));---------");

        String sentence8 = "I love Java programming",// only first index needed in this case
                sub8 = sentence8.substring(sentence8.indexOf("J"));
        System.out.println(sub8);

        System.out.println("-------------sentence9.substring(sentence9.lastIndexOf(' ')+1);----------------------");

        String sentence9 = "Today is Sunday, Tomorrow is Monday"; // use of last index method
        String tomorrow = sentence9.substring(sentence9.lastIndexOf(' ')+1);
        System.out.println(tomorrow);

        System.out.println("-----------------");

        String sentence10 = "I study at Cydeo School";
        String schoolName = sentence10.substring(11);
        System.out.println(schoolName);

        System.out.println("-------.repeat(int value)-------");
           String test = "Hello";
            String res1 =  (test+"\n").repeat(5); // x5 Hello in new lines
             String res2 =  (test+" ").repeat(5); //  x5 Hello with spaces ( has space in the end )
              String res3 =  (" "+test).repeat(5); //  x5 Hello with spaces ( has space in the beginning )
        System.out.println(res1); // x5 Hello in new lines
         System.out.println(res2); //Hello Hello Hello Hello Hello
          System.out.println(res3); // Hello Hello Hello Hello Hello










    }
}
