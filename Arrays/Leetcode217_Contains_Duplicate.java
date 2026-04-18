import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        boolean duplicateCount = false;

        set.add(nums[0]);

        for (int i = 1; i < n; i++) {
            if (set.contains(nums[i])) {
                duplicateCount = true;
                break;
            } else {
                set.add(nums[i]);
            }
        }
        return duplicateCount;
    }
}

public class Leetcode217_Contains_Duplicate {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 2, 3, 1}; // test input

        boolean result = sol.containsDuplicate(nums);

        System.out.println("Contains Duplicate: " + result);
    }
}