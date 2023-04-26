package day23_arrayList;

import java.util.ArrayList;

public class Replit1 {
    public static void main(String[] args) {

        ArrayList<Integer> digits = new ArrayList < > ();
         digits.add(123);
         digits.add(34);
         digits.add(513);
        System.out.println(digits); // 6 7 9
        ArrayList<Integer> res = new ArrayList<>();
        Integer sum;
        for (int i=0; i< digits.size();i++) {
            sum = 0;
            for (int j = 0; j < digits.get(i).toString().length(); j++) {
                sum+= Integer.parseInt(String.valueOf(digits.get(i).toString().charAt(j)));
            }
            res.add(sum);

        }
        System.out.println(res);








        }


    }
