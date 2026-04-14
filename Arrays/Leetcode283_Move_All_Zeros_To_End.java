class Solution {
    public void moveZeroes(int[] nums) {
        int post = 0;

        for (int scan = 0; scan < nums.length; scan++) {
            if (nums[scan] != 0) {
                nums[post] = nums[scan];
                post++;
            }
        }

        for (int i = post; i < nums.length; i++) {
            nums[i] = 0;
        }
        
        // Printing the Array
        for(int i =0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}

public class Leetcode283_Move_All_Zeros_To_End {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {0, 1, 0, 3, 12}; // input (like LeetCode)

        sol.moveZeroes(nums); // LeetCode calls this internally

       
    }
}