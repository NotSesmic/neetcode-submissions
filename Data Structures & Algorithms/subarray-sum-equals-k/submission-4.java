class Solution {
    public int subarraySum(int[] nums, int k) {
       
       int result = 0,currSum = 0;

       HashMap<Integer,Integer> prefixSum = new HashMap<>();
       prefixSum.put(0,1);

       for(int num : nums){
        currSum += num;
        int diff = currSum - k;
        result += prefixSum.getOrDefault(diff,0);
        prefixSum.put(currSum,prefixSum.getOrDefault(currSum,0) + 1);
       }
       return result;
    }
}