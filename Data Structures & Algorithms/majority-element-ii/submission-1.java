class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        List<Integer> finalEle = new ArrayList<>();
        int numLen = nums.length;
        for(int i = 0; i < numLen; i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0) + 1);
        }

       freq.forEach((k,v) -> 
        {
            if(v > numLen/3){
                finalEle.add(k);
            }
        }
       );

        return finalEle;
    }
}