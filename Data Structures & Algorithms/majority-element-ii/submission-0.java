class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        List<Integer> finalEle = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0) + 1);
        }

        for(Map.Entry<Integer,Integer> pair : freq.entrySet()){
            if(pair.getValue() > nums.length / 3){
                finalEle.add(pair.getKey());
            }
        }

        return finalEle;
    }
}