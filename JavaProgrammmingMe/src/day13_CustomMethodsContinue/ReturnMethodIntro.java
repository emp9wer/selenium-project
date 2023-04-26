package src.day13_CustomMethodsContinue;

public class ReturnMethodIntro {

    public static void main(String[] args) {
        int a = 20,  b = 30;
        int c = sum(a,b);
        System.out.println(c);
        System.out.println("`````````````````````````````````````");

        String aa = "aaaaa",bb ="sssss",aabb;
        aabb = swear(aa,bb);
        System.out.println(aabb);
        System.out.println("``````````````````````````````````````");

        int a1 = 22;
        int b1 = square(a1);
        System.out.println(b1);
        int bCube = cube(a1);
        System.out.println(bCube);

    }
    public static int sum(int n1, int n2){
        int result = n1+n2;
        return result;
    }
    public static String swear(String a , String b){
        String combine = a.toUpperCase() +""+b.toUpperCase();
        return combine;
    }
    public static int square(int a){
        int sq = a*a;
        return sq;
    }
    public static int cube (int num){
        int cube = square(num) * num;
        return cube;
    }




}
