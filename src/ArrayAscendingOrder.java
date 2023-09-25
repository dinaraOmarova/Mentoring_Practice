import java.util.Arrays;

public class ArrayAscendingOrder {
    public static void main(String[] args) {

        int[] nums = {3, 7, 6, 2, 9};
        for (int i = 0; i < nums.length; i++ ) {
            int count = 0;
            for (int j = i+1; j < nums.length ; j++) {
                if(nums[i]>nums[j]){
                    count = nums[i];
                    nums[i] = nums[j];
                    nums[j]=count;

                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
