package Self_PracticeKir.day19_Array;

public class ClassmatesInitials_01 {
    public static void main(String[] args) {

        String[] classmates = {"Mike Babb","Andrew Fffa","Sarah Jaaaf","Anna Tasfa","John Sdsfsdf","Katie Afdsfds","Claire Madd","Bill Jfaa","Jason Mdas","Donna Afasf"};

        for (int i = 0; i < classmates.length; i++) {
            System.out.println(classmates[i].substring(0,1)+". "+classmates[i].charAt(classmates[i].indexOf(" ")+1)+".");
        }


    }
}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines

 */