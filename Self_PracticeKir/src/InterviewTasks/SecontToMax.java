package src.InterviewTasks;

public class SecontToMax {
    public static void main(String[] args) {


        int[] a = {1, 2, 77777777, 45, 5, 6, 7, 8, 9, 9, 0, 235, 23526, 3646, 1241, 12452352, 3, 0,-22};

        int max = Integer.MIN_VALUE;
        int secondToMax = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                secondToMax=max;
                max=a[i];
            } else if (a[i]>secondToMax&&a[i]!=max) {
                secondToMax=a[i];
            }
        }
        
        System.out.println(max);
        System.out.println(secondToMax);

    }
}
