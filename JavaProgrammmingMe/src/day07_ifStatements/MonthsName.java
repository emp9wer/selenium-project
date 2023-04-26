package src.day07_ifStatements;

public class MonthsName {
    public static void main(String[] args) {
        int n = 12;
        String month = "";

        if (n >= 1 && n <= 12){
            if (n==1){
                month = "jan";
            } else if (n==2) {
                month = "feb";
            } else if (n==3) {
                month = "mar";
            }else{
                month = "other 9 months";
            }
        }else{
            System.out.println("no such a month");
        }
        System.out.println(month);
    }
}
