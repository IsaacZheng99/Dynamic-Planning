package leetcode;

import static java.lang.StrictMath.max;

public class DynamicPlanning {
    public int maxSubArray(int[] nums){
        int pre = 0;
        int maxSum = nums[0];

        for(int x : nums){
            pre = max(pre + x, x);
            maxSum = max(pre, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        DynamicPlanning dynamicPlanning = new DynamicPlanning();
        int maxSum = dynamicPlanning.maxSubArray(nums);
        System.out.println("The sum of the max sub-array is : " + maxSum);
    }
}
