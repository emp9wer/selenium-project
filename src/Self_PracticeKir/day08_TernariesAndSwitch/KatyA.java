package Self_PracticeKir.day08_TernariesAndSwitch;

public class KatyA {
    public static void main(String[] args) {
        String batch = "US eveningdgsgs";

        if (batch == "US morning" || batch == "US evening" || batch == "EU") {
            switch (batch) {
                case "US morning":
                    System.out.println("\"Class times are 10-5 EST. M, T, Th, F.\"");
                    break;
                case "US evening":
                    System.out.println("\"Class times are 7-10 EST. M, T, W, Th, S, S\"");
                    break;
                default:
                    System.out.println("\"Class times are  10-5 EST. M, T, W, Th, F.\"");
                    break;
            }
        } else {
            System.out.println("\"Invalid Batch\"");


        }
    }
}