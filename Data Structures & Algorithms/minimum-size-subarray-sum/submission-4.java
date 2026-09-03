class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        boolean sumFound = false;
        int minLen = Integer.MAX_VALUE;
        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            while(left < nums.length && sum >= target){
                sumFound = true;
                minLen = Math.min(minLen,right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        if(!sumFound) return 0;
        return minLen;
    }
}