package Java_Office_HoursKir.week5.morning;

public class T4Reverse {
    public static void main(String[] args) {

        String str = "hello";
        String reverse = "" + str.charAt(4) + str.charAt(3) +str.charAt(2) +str.charAt(1) +str.charAt(0);
        System.out.println(reverse);


        int index = str.length() -1;
        String reverse2 = "" + str.charAt(index --) + str.charAt(index --) +str.charAt(index --) +str.charAt(index --) +str.charAt(index --);
        System.out.println(reverse2);

        for (int i = 0; i<10 ; i++){
            System.out.println("HollaBolla\n");
        }



    }
}
