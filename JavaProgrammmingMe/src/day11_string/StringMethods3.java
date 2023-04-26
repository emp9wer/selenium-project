package src.day11_string;

public class StringMethods3 {

    public static void main(String[] args) {

        System.out.println("----------------.isEmpty()-------------------"); // last index integer = 0;
        String word1 = ""; //returns true if string is empty ( will return false is string has spaces in it.)
        boolean r1 = word1.isEmpty();
        //String word1 = "aa";  //false
        //String word1 = "   "; //false
        System.out.println(r1); //true


        System.out.println("----------------.isBlank()-------------------");
        String word2 = "    "; // returns true if string has spaces only - means blank /     or its empty
        //  String word2 = ""; //true
        // String word2 = "    a  "; // false
        boolean r2 = word2.isBlank();
        System.out.println(r2); //true  // if word has anything other than spaces it will return false


        System.out.println("----------------.equals()-------------------");
        //case sensitive

        String w1 = "Holla";
        String w2 = "holla";
        String w3 = "Holla";
        boolean isEqual = w1.equals(w2);
        System.out.println(isEqual); // false // case sensitive
        System.out.println(w1.equals(w3)); // true


        System.out.println("----------------.equals()-------------------");
        // ignores case sensitivity

        String s1 = "Java", s2 = "JAVA";
        System.out.println(s1.equalsIgnoreCase(s2)); // true

        // do not use == with Strings!!!!

        System.out.println("----------------.contains()-------------------");
        //does not ignore case sensitivity
        String a1 = "Java", b1 = "Hello we study Java";
        System.out.println(a1.contains(b1)); // false
        System.out.println(b1.contains(a1)); // true

        String nameList = "Kirill Maria Alex Claire";
        boolean isInNameList = nameList.contains("Claire");
        System.out.println("isInNameList = " + isInNameList); // true

        String sentence = "My favourite programming language is JaVA";
        boolean hasJava = sentence.toLowerCase().contains("java"); // way to ignore CASE SENSITIVITY
        boolean hasJava1 = sentence.toUpperCase().contains("JAVA"); // way to ignore CASE SENSITIVITY
        System.out.println("hasJava = " + hasJava);
        System.out.println("hasJava1 = " + hasJava1);


        System.out.println("----------------.startsWith()-------------------");

        String cybertek = "Cybertek School is the best";
        boolean ifStartsWith = cybertek.startsWith("Cybertek");
        System.out.println("ifStartsWith = " + ifStartsWith); // true

        String url = "www.cydeo.com";
        boolean isValid = url.startsWith("www."); // true
        //boolean isValid = url.startsWith("w"); // true
        System.out.println("isValid = " + isValid);

        System.out.println("----------------.endsWith()-------------------");

        String cybertek1 = "Cybertek School is the best";
        //  boolean ifEndsWith = cybertek1.endsWith("a");//false
        //  boolean ifEndsWith = cybertek1.endsWith("best"); // true
            boolean ifEndsWith = cybertek1.endsWith("t"); // true
            System.out.println("ifEndsWith = " + ifEndsWith); // true

        System.out.println("-------------------------------------------");
        String email = "hollabolla@mail.ru";
        //if domain will be different all booleans wil lbe false
        boolean isGmail = email.endsWith("gmail.com"); // false

        boolean isYahoo = email.endsWith("yahoo.com"); // false

        boolean isHotmail = email.endsWith("hotmail.com"); // false

        System.out.println("isHotmail = " + isHotmail);
        System.out.println("isYahoo = " + isYahoo);
        System.out.println("isGmail = " + isGmail);


    }
}
