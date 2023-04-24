package Self_PracticeKir.day06_IfElsePractice;

public class MedianNumber_002 {
    public static void main(String[] args) {
        int a = 4, b = 2, c = 5, d = 1;

        // Find the smallest and largest numbers
        int smallest = a;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;
        if (d < smallest) smallest = d;

        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;
        if (d > largest) largest = d;

        int median1 = smallest;
        int median2 = largest;

        if (a > smallest && a < largest) {
            if (b <= a && c <= a && d <= a) {
                median1 = a;
            } else {
                median2 = a;
            }
        }

        if (b > smallest && b < largest) {
            if (a <= b && c <= b && d <= b) {
                median1 = b;
            } else {
                median2 = b;
            }
        }

        if (c > smallest && c < largest) {
            if (a <= c && b <= c && d <= c) {
                median1 = c;
            } else {
                median2 = c;
            }
        }

        if (d > smallest && d < largest) {
            if (a <= d && b <= d && c <= d) {
                median1 = d;
            } else {
                median2 = d;
            }
        }

        // The two median numbers are median1 and median2
        System.out.println("Two median numbers: " + median1 + ", " + median2);

    }
}