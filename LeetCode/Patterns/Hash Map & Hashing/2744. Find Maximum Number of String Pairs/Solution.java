class Solution {

    public  String reverse(String rev){
        String s ="";
        for(int i=rev.length()-1;i>=0;i--){
            s +=rev.charAt(i);
        }
        return s;
    }
    public int maximumNumberOfStringPairs(String[] words) {
            int count=0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                String a = words[i];
                String b = words[j];
                 
                 String rev= reverse(b);
                if(rev.equals(a)){
                    count++;
                }
            }
        }
        return count;
    }
}