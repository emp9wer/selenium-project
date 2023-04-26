package day11_String;

import java.util.Scanner;

public class PrefixAgainReplit {
    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.next();// abXYabc
        int n = scan.nextInt(); //1
                                            //false
        //WRITE YOUR CODE BELOW
        String prefix = str.substring(0, n);

        String woPrefix = str.substring(n, str.length());

        boolean contains = woPrefix.contains(prefix);

        System.out.println(contains);

        scan.close();


        // code below checks if prefix of first 2 letters contains in word 1-3 times depending on int n;

      /*     String prefix = str.charAt(0) +""+ str.charAt(1);
           String strLessPrefix = str.substring(2);
           String strLessPrefix2 = strLessPrefix.substring(0,strLessPrefix.lastIndexOf(prefix));
           if(n==1){
               System.out.println("true");
           } else if (n==2) {
               if (strLessPrefix.contains(prefix)) {
                   System.out.println("true");
            }else {
                   System.out.println("false");
               }
    }else{
               if (strLessPrefix2.contains(prefix)) {
                   System.out.println("true");
           }else{
                   System.out.println("false");
               }
           }
           scan.close();
*/






    }
}
/*
### Use `String methods` to determine if the prefix is found again somewhere later in the String. A prefix is the set of characters in the beginning of the String. To determine how long the prefix is,  use the given `n` value. For example, if `n` is 2, the prefix is the first two characters, so you would check if the String from the 3rd character until the end has those two character repeating anywhere. Output the result as a `boolean value, true or false`.
Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation

```
Ex:
  Input:
    abXYabc
    1

  Output:
    true

  -> 'a' is the prefix because n is 1, and the character 'a' is found again in the String "bXYabc"
```

```
Ex:
  Input:
    abXYabc
    2

  Output:
    true

  -> 'ab' is the prefix because n is 2, and the characters 'ab' are found again in the String "XYabc"
```
```
Ex:
  Input:
    abXYabc
    3

  Output:
    false

  -> 'abX' is the prefix because n is 3, and the characters 'a' are NOT found again in the String "Yabc"
```


 */