class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int slow = 0;

        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }

        return slow + 1;
    }
}

public class Leetcode26_Remove_Duplicates {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int k = sol.removeDuplicates(nums);

        System.out.println("Unique count: " + k);
        System.out.print("Array: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}