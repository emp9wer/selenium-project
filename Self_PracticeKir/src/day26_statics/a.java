package src.day26_statics;

public class a {
    public boolean commonEnd(int[] a, int[] b) {
        if((a[0]==b[0] || a[a.length-1]==b[b.length-1]) && (a.length>=1&&b.length>=1)){
            return true;
        }
        return false;
    }




    public static void main(String[] args) {
        char [] z = {'1','2'};
        System.out.println(z);
    }





}
