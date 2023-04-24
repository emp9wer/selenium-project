package practice01;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size = "tall";
        double price = 0;
        int calories = 0;
        String result;
        String invalidSize = "Invalid size";


        if(size == "tall" || size == "grande" || size == "venti"){
            if (size == "tall"){
                price = 3.69; calories = 90;
            }
            if (size == "grande"){
                price = 3.99; calories = 120;
            }
            if (size == "venti"){
                price = 4.29; calories = 150;
            }
            result = size+":"+"\n\t\t\tprice is $"+ price + "\n\t\t\t" + calories + " calories";
            System.out.println(result);
        }else{
            System.out.println(invalidSize);
        }







    }


}
