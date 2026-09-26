class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {

        int n= friends.length;
        int res[] = new int[n];
        int k=0;

        for(int i=0;i<order.length;i++){
            boolean flag =false;
                for(int j=0;j<friends.length;j++){
                    if(order[i]==friends[j]){
                        flag = true;
                    }
                }

            if(flag){
                res[k]=order[i];
                k++;
            }
        }

        return res;
        
    }
}