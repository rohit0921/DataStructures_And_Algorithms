
public class SecondLargestElementInArray {
    public static void main(String[] args) {
        
        int[] nums = {0,10,7,8,2,4,4};
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        for (int i = 1; i<nums.length; i++) {
            if(nums[i]>first){
                second = first;
                first = nums[i];
                
            }
            else if(nums[i] < first && nums[i] > second){
                second = nums[i];
            }
        }
        System.out.println(second);
        
    }
}