package src.day28_Encapsulation;

public class IntTask2 {
    public static void main(String[] args) {

        boolean res = change(34,3,2);
        System.out.println(res);
    }


    private static boolean change(int money , int numberOfShirt , int numberOfTshirt){
        return (money- (numberOfShirt*6+numberOfTshirt*8))==0;

    }


}
