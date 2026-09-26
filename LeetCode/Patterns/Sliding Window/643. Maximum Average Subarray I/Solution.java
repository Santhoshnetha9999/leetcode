class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int window_sum=0;
        double Mx=0;
        int l= nums.length;
        
        // first window sum
        for(int i=0;i<k;i++){
            window_sum +=nums[i];
        }

       double average = (double)window_sum/k;
        if(k>1 || k<l){  
            if(k==l){
                return average;
            }else{
            for(int j=k;j<nums.length;j++){
                window_sum +=nums[j];
                window_sum-=nums[j-k];
                double avg2 = (double)window_sum/k;

                Mx = Math.max(Mx , avg2);
            }
        }
        }else{
            return average;
        }

        return Mx;
    }
}