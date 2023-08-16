package TwoSum;

public class Main {
    public static void main(String[] args) {
        Solution solution1 = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution1.twoSum(nums,target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
