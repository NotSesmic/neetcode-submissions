class Solution {

    private void reverse(int [] nums,int start,int end){

        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }

    public void rotate(int[] nums, int k) {

        int len = nums.length;
        int breakPoint = (k%len);
        if(breakPoint > 0){
        reverse(nums,0,len - 1);
        reverse(nums,0,breakPoint - 1);;
        reverse(nums,breakPoint, len - 1);
        }
        
    }
}