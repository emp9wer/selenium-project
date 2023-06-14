package src.day11_String;

import java.util.Scanner;

public class ReverseItReplit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE BELOW
        String reverse ="";
        if (word.length()<5){
            System.out.println("Too short!");
        } else if (word.length()>5) {
            System.out.println("Too long!");
        }else {
            char a,b,c,d,e;
            a=word.charAt(0); b=word.charAt(1); c=word.charAt(2); d=word.charAt(3); e=word.charAt(4);
            System.out.print(e+""+d+c+b+a);
        }


    }
}
/*
### Use `String methods` and `if statements` to reverse a String that is five characters long. If the given `word` is not five characters long, it will not be reversed. Use the following to output a value:

> - If the `word` is less than 5 characters: print `Too short!`
> - If the `word` is more than 5 characters: print `Too long!`
> - If the `word` is 5 characters: print the `reversed version` of the String. Reading characters from the end to the beginning.


Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation, if statements

```
Ex:
  Input:
    cat

  Output:
    Too short!
```

```
Ex:
  Input:
    singularity

  Output:
    Too long!
```
```
Ex:
  Input:
    apple

  Output:
    elppa
 */