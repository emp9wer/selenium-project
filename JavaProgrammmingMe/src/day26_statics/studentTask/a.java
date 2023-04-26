package src.day26_statics.studentTask;

public class a {
    public static void main(String[] args) {
        System.out.println(xyzThere("abcxyz"));
    }
    public static boolean xyzThere(String str) {

        boolean res = false;

        if(str.length() > 3){

            for(int i =0;i<=str.length()-3; i++){

                if(str.substring(i,i+3).equals("xyz") && str.charAt(i-1)!='.'){
                    return true;

              }


            }
        }
        return false;
    }
}
