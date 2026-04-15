class Solution{
    public void rotate(int[] nums, int k) {

        int n =nums.length;
        k =k%n;
        reverse(nums,0,n-1); // 7 6 5 4 3 2 1
        reverse(nums,0,n-1-k);
        reverse(nums,n-k,n-1);

    }

    public void reverse(int nums[], int start, int end){
        while(start<end){
                int temp;
                temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;

                start++;
                end--;

            }
        }
}



class RotateArray_Left_By_ksteps{
    public static void main(String args[]){
        Solution sol = new Solution();

        int[] nums = {1,2,3,4,5,6,7};
        int k =3;
        sol.rotate(nums,k);

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

    }
}




