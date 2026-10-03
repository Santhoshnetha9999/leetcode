class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        //frequency counting 
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //finding duplicate 
        for(int key : map.keySet()){
            if(map.get(key)>1){
                return key;
            }
        }
        return -1;
    }
}