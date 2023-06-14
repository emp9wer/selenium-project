import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        /*
        String name = "Gleb Kandakov born 2000";
        //             0123456789
        //             12345
        String reverseName ="";
        for(int i = name.length()-1; i>=0; i--){
            reverseName += name.charAt(i);
       }
        reverseName = reverseName.replace("o","");
        reverseName = reverseName.replace("0","xxx");
        System.out.println(reverseName);

*/

        double[] a ={1,2,3,4,5,6,7,8,9,10};

        for (double ea : a) {
            if(ea%2!=0){
                System.out.println(ea);
            }
        }

        System.out.println(Arrays.toString(a));

    }
}
