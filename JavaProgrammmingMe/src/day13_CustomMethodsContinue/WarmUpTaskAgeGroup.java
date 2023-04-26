package src.day13_CustomMethodsContinue;

public class WarmUpTaskAgeGroup {
    public static void main(String[] args) {
ageGroup(23);
eligibleToVote(33,true);
    }

    public static void ageGroup (int age) {

            if (age >= 0 && age <= 150) {
                if (age < 21) {
                    System.out.println("Teenager");
                } else if (age >= 21 && age < 55) {
                    System.out.println("Adult");
                } else {
                    System.out.println("Senior");
                }
            } else {
                System.out.println("invalid age: " + age);
            }
        }
    public static void eligibleToVote(int age, boolean isAmerican){

        if(age>=18 && isAmerican){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }


        }

}





