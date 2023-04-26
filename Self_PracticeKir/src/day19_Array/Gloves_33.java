package day19_Array;

public class Gloves_33 {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };

        double[] prices = {99.99,150.0,9.99,250.0,439.50,39.99};

        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
// 1. find out the first index number of "Gloves"
        String search = "Gloves";
        int indexResult = -1000;

        for (int i = 0; i < items.length; i++) { // iterates fo each index element of String array items
            if(items[i].equals(search)){
                indexResult = i;
            }
        }
        if(indexResult == -1000){
            System.out.println("Item is not found in array");
        }else{
            System.out.println("Index of search: " + indexResult);
        }
// 2. find out if "iPad" is contained in the item list

        boolean isIpadContained = false;

        for (String each : items) {

            if(each.equals("iPad")){

                isIpadContained = true;
            }
        }
        System.out.println("isIpadContained = " + isIpadContained);
//Print the report of each shopping item
//            name - price - #ID

        for (int i = 0; i < prices.length; i++) { // iterates for amount of indexes in arrays

            System.out.println(items[i]+" - "+prices[i]+" - "+itemIDs[i] );

        }






    }
}
