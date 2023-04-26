package src.day20_forEachArrayContinue;

public class NonDupREPLIT {

    public static void main(String[] args) {
        int[] nums = {6, 44, 6, 4, 3, 4, 1}; // 44

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {

                if(nums[i]==nums[j]){
                    count++;

                }

            }
            if(count==1){
                System.out.println(nums[i]);
                break;
            }

        }


    }

}
