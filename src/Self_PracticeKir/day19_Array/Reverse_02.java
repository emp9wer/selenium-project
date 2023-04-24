package Self_PracticeKir.day19_Array;

public class Reverse_02 {
    public static void main(String[] args) {

        String[] classMates = {"Mike Babb", "Andrew Fffa", "Sarah Jaaaf", "Anna Tasfa", "John Sdsfsdf", "Katie Afdsfds", "Claire Madd", "Bill Jfaa", "Jason Mdas", "Donna Afasf"};


        for (int i = 0; i < classMates.length; i++) { // iterating elements of Array classMates // using outer loop 1)

            for (int j = classMates[i].length()-1; j >= 0; j--) { // we are iterating from last index of each element of classMates Array

                System.out.print(classMates[i].charAt(j));
            }

            System.out.println();
        }
    }
}

/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */