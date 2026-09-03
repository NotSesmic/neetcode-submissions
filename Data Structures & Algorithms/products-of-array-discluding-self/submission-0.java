class Solution {
    public int[] productExceptSelf(int[] nums) {

        int numOfEle = nums.length;

        int[] result = new int[numOfEle];

        result[0] = 1;

        for(int i = 1; i < numOfEle; i++){
            result[i] = result[i -1] * nums[i - 1];
        }

        int postFix = 1;

        for(int i = numOfEle -1; i >= 0; i--){
            result[i] *= postFix;
            postFix *= nums[i];
        }

        return result;
    }
}  
