package src.day02_escapeSequences;

public class EscapeSequences {
/*
\n Newline - Advances the cursor to the next line for subsequent printing
\t Horizontal Tab -(adds paragraph space) Causes the cursor to skip over to the next tab stop
\\ Backslash - Causes a backslash to be printed
\" Double quote - Causes a double quotation mark to be printed
*/
    public static void main(String[] args) {

        System.out.println("Hello students\nToday we have Java class"); // \n = new line
        System.out.println("-----------------------------------------------------");

        System.out.println("\tJava Programming Language"); //skips to next tab stop (adds paragraph space)
        System.out.println("\t\tJava Programming Language");
        System.out.println("-----------------------------------------------------");

        System.out.println("\\"); // prints \
        System.out.println("-----------------------------------------------------");

        System.out.println("My favorite TV show is \"The Walking Dead\""); // \" prints "

    }
}
