package day20_forEachArrayContinue;

public class UniqueElements_4 {
    public static void main(String[] args) {

        String[] words = {"Java","Java","Python","Muhtar","Python"};
            int count;
        for (String each1 : words) {
            count=0;
            for (String each2 : words) {
                if(each1.equals(each2)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(each1);
            }
        }


    }
}
/*
4. Write a program that can display the unique elements of an array

			MUST use for each loops

 */