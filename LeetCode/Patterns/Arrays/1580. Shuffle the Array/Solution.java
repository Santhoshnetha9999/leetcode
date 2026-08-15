class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] shuffle =new int[2*n];
       
        int p1=0;
        int p2 =n;

        for(int i=0;i<2*n;i++){
            if(i%2==0){
                shuffle[i]=nums[p1];
                p1++;
            }else {
                shuffle[i]=nums[p2];
                p2++;
            }
        }

     return shuffle;

    }
}