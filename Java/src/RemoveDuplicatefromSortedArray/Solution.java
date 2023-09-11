package RemoveDuplicatefromSortedArray;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;  // unique number
        int len = nums.length;

        for(int i = 1; i <len; i++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;

    }
}
