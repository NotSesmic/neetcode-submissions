class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> S = new HashSet<>();

        for(int ele : nums){
            S.add(ele);
        }
        int setSize = S.size();
        int maxValue = 0,i=0;


        for(int ele : S){
            if(!S.contains(ele - 1)){
                int length = 1;
                while(S.contains(ele + length)){
                    length++;
                }
            maxValue = Math.max(maxValue,length);
            }
        }

        return maxValue;
    }
}
