package src.day08_ternaries_switch;

public class SwitchStatementIntro2 {

    public static void main(String[] args) {

        int n = 4; // 1~7

        String day = "";

        switch(n){
            case 1: day = "mon";
                break;
            case 2: day = "tue";
                break;
            case 3: day = "wed";
                break;
            case 4: day = "thu";
                break;
            case 5: day = "fri";
                break;
            case 6: day = "sat";
                break;
            case 7: day = "sun";
                break;
            default: day = "invalid";
                break;

        }
        System.out.println(day);
    }
}
