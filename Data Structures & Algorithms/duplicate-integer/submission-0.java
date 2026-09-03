class Solution {
    public boolean hasDuplicate(int[] nums) {

        Map<Integer,Integer> M = new HashMap<>();

        for(int i = 0; i < nums.length;i++){
            M.put(nums[i],M.getOrDefault(nums[i],0) + 1);
        }

        for(int i = 0; i < nums.length;i++){
            if(M.get(nums[i]) > 1){
                return true;
            }
        }
        return false;
    }
}