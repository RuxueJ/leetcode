package SortArrayByParity;

public class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int temp;
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if((nums[i] & 1) == 0){ //nums[i] is even
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }

        }
        return nums;
    }
}
