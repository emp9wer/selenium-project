package Self_PracticeKir.day22_arrayList;

import java.util.ArrayList;

public class CombineStringArrays_3 {
    public static void main(String[] args) {
        String[]arr1 = {"A", "B", "C"};
        String[]arr2 = {"D", "E", "F", "G"};
        ArrayList<String> list = new ArrayList<>();
        for (String eaArr1 : arr1) {
            list.add(eaArr1);
        }
        for (String eaArr2 : arr2) {
            list.add(eaArr2);
        }
        System.out.println(list);//[A, B, C, D, E, F, G]

    }
}
/*
3. write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */