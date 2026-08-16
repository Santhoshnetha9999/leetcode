class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] ans = new int[nums.length*2];
        int count=0;
        
        for(int i=0;i<ans.length;i++){

            if(i==nums.length){
                count=0;
            }
            ans[i] = nums[count];
            count++;
        }


        return ans;
        
    }
}