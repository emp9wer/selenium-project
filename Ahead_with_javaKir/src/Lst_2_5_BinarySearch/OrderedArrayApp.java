package Lst_2_5_BinarySearch;
import java.util.Scanner;

public class OrderedArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;                                      //set up the length of new array
        OrderedArray arr;                                       //go to class OrderedArray constructor
        arr = new OrderedArray(maxSize);                        //create an array

        System.out.println("\nWe created empty array");
        arr.display();

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(5);
        arr.insert(0);
        arr.insert(99);

        System.out.println("We filled the array with next elements:");
        arr.display();
        System.out.println("input value to find in array");
        Scanner b = new Scanner(System.in);
        int searchKey = b.nextInt();
        System.out.println("\nNow we are tying to find element with value: " + searchKey + ". And the result is: ");

        if(arr.find(searchKey) != arr.size()){
            System.out.println(searchKey + " was found");
        } else {
            System.out.println("Can't find " + searchKey);
        }
        System.out.println("type in 3 values to delete from array");
        Scanner a = new Scanner(System.in);
        int deletElm1 = a.nextInt();
        int deletElm2 = a.nextInt();
        int deletElm3 = a.nextInt();
        System.out.println("\nNow we are tying to delete next elements from the array: " + deletElm1 + ", " + deletElm2 + ", " + deletElm3);

        arr.delete(deletElm1);
        arr.delete(deletElm2);
        arr.delete(deletElm3);

        System.out.println("\nAnd finally we got next array:");


        arr.display();

    }
}
