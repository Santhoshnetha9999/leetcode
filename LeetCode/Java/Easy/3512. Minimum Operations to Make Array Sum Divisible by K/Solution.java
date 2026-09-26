class Solution {
    public int minOperations(int[] nums, int k) {
        int sum =0;
    

        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
        }

       
        return sum % k;
    }
}