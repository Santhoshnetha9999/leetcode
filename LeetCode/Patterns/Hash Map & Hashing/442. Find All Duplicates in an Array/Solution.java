class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> l = new ArrayList<>();
        // frequency counting
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //finding duplicates
        for(int key : map.keySet()){
            if(map.get(key)>1){
                l.add(key);
            }
        }
        return l;
    }
}