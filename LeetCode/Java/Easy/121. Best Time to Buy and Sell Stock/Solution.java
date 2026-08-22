class Solution {
    public int maxProfit(int[] prices) {

        int l=prices.length;
        int min =prices[0];
        int min_index =0;
        int max_diff =0;

        for(int i=1;i<l;i++){
            if(prices[i]<min){
                min=prices[i];
                min_index= i;
            }
        }


        for(int j=min_index+1;j<l;j++){
            int diff = prices[j]-min;
            max_diff =Math.max(diff,max_diff);
        }

        return max_diff;
    }
}