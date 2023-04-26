package day08_TernariesAndSwitch;

public class CydeoBatches_10 {
    public static void main(String[] args) {

        String batch = "US morning"; //US morning, US evening, EU


        System.out.println("`````````````use of if statement`````````````");
        // use of if statement


        if (batch == "US morning") {
            System.out.println("\"Class times are 10-5 EST. M, T, Th, F.\"");
        } else if (batch == "US evening") {
            System.out.println("\"Class times are 7-10 EST. M, T, W, Th, S, S\"");
        } else if (batch == "EU") {
            System.out.println("\"Class times are  10-5 EST. M, T, W, Th, F.\"");
        } else {
            System.out.println("\"Invalid Batch\"");
        }


        System.out.println("`````````````use of switch statement``````````````````");
        // use of switch statement


        switch (batch) {
            case "US morning":
                System.out.println("\"Class times are 10-5 EST. M, T, Th, F.\"");
                break;
            case "US evening":
                System.out.println("\"Class times are 7-10 EST. M, T, W, Th, S, S\"");
                break;
            case "EU":
                System.out.println("\"Class times are  10-5 EST. M, T, W, Th, F.\"");
                break;
            default:
                System.out.println("\"Invalid Batch\"");
                break;
        }


        System.out.println("```````````````use of if & switch statements mixed````````````````");
        // use of if & switch statements mixed


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
/*
10. Create a class named CydeoBatches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */