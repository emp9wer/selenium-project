package src.day12_Custom_methods;

public class EligibleToVote_6 {
    public static void main(String[] args) {
boolean a = false;
int age1 = 25;
eligibleToVote(age1,a);

    }

    public static void eligibleToVote(int age, boolean isAmerican){
        System.out.println(((age >= 21 ) && (isAmerican == true)) ? "You are eligible to vote" : "You are NOT eligible to vote");


    }
}
