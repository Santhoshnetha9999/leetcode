class Solution {
    public int removeDuplicates(int[] nums) {
        int w=1;
        for(int r=0;r<nums.length;r++){
            if(nums[w-1]!=nums[r]){
                nums[w]=nums[r];
                w++;
            }
        }
        return w;
    }
}