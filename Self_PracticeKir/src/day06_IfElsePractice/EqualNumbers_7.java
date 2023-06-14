package src.day06_IfElsePractice;

public class EqualNumbers_7 {
    public static void main(String[] args) {
        int n1 = 1, n2 = 5, n3 = 31;
        String result = "";
        if((n1 == n2) && (n1 == n3) && (n2 == n3)){
            result = "all equal";
        }
        if((n1 == n2) && (n1 != n3) && (n2 != n3)){
            result = "n1&n2 are equal";
        }
        if((n1 != n2) && (n1 != n3) && (n2 == n3)){
            result = "n2&n3 are equal";
        }
        if((n1 != n2) && (n1 == n3) && (n2 != n3)){
            result = "n3&n1 are equal";
        }
        if((n1 != n2) && (n1 != n3) && (n2 != n3)) {
            result = "none of them are equal";
        }
        System.out.println(result);
    }
}
/*
7. Create a class named EqualNumbers, and write a program that can check the equality of the three given numberrs
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are qual ==>print "n3&n1 are equal"
				if none of them are euqal ==> none of them are equal
 */