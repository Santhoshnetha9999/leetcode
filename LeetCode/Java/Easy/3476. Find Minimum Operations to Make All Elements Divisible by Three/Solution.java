class Solution {
    public int minimumOperations(int[] nums) {
        int k=3;
        int op= 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]%3!=0){
                op++;
            }
        }
        return op;
    }
}