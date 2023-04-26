package src.day27_accessModifiers;

public class timer {

    public static void main(String[] args) throws InterruptedException {


        int a = 100;
        for (int i = 0; i <=  a; i++) {
            System.out.print("\rloading " + (i)+"%");
            Thread.sleep(10);
        }


        Thread.sleep(3000);
        System.out.print("\r Here is a little flower");
        Thread.sleep(4000);
        System.out.print("\r      .--.\n" +
                "    .'_\\/_'.\n" +
                "    '. /\\ .'\n" +
                "      \"||\"\n" +
                "       || /\\\n" +
                "    /\\ ||//\\)\n" +
                "   (/\\\\||/\n" +
                "______\\||/_______ ");
        Thread.sleep(4000);
        System.out.print("\r Here is a bigger flower)");
        Thread.sleep(4000);
        System.out.print("\r           .-.'  '.-.\n" +
                "          .-(   \\  /   )-.\n" +
                "         /   '..oOOo..'   \\\n" +
                " ,       \\.--.oOOOOOOo.--./\n" +
                " |\\  ,   (   :oOOOOOOo:   )\n" +
                "_\\.\\/|   /'--'oOOOOOOo'--'\\\n" +
                "'-.. ;/| \\   .''oOOo''.   /\n" +
                ".--`'. :/|'-(   /  \\   )-'\n" +
                " '--. `. / //'-'.__.'-;\n" +
                "   `'-,_';//      ,  /|\n" +
                "        '((       |\\/./_\n" +
                "          \\\\  . |\\; ..-'\n" +
                "           \\\\ |\\: .'`--.\n" +
                "            \\\\, .' .--'\n" +
                "             ))'_,-'`\n" +
                "       jgs  //-'\n" +
                "           // \n" +
                "          //\n" +
                "         |/");
        System.out.print("\r Here many little flowers)");
        Thread.sleep(4000);
        System.out.print("\r                _(_)_                          wWWWw   _\n" +
                "      @@@@       (_)@(_)   vVVVv     _     @@@@  (___) _(_)_\n" +
                "     @@()@@ wWWWw  (_)\\    (___)   _(_)_  @@()@@   Y  (_)@(_)\n" +
                "      @@@@  (___)     `|/    Y    (_)@(_)  @@@@   \\|/   (_)\\\n" +
                "       /      Y       \\|    \\|/    /(_)    \\|      |/      |\n" +
                "    \\ |     \\ |/       | / \\ | /  \\|/       |/    \\|      \\|/\n" +
                "jgs \\\\|//   \\\\|///  \\\\\\|//\\\\\\|/// \\|///  \\\\\\|//  \\\\|//  \\\\\\|// \n" +
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");








    }


}
