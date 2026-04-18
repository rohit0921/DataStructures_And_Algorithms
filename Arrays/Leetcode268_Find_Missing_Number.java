class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int arrSum = 0;
        int sumOfn = (n * (n + 1)) / 2;

        for (int i = 0; i < n; i++) {
            arrSum += nums[i];
        }

        int result = sumOfn - arrSum;
        return result;
    }
}

public class Leetcode268_Find_Missing_Number {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {3, 0, 1}; // example input

        int result = sol.missingNumber(nums);

        System.out.println("Missing Number: " + result);
    }
}