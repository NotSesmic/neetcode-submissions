class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int [] indices = new int[2];
        int len = numbers.length;
        int j = len - 1;
        int i = 0;

        while(i < j){
            int sum = numbers[i] + numbers[j];
            if(sum < target){
                i++;
            }
            else if(sum > target){
                j--;
            }
            else{
                indices[0] = i + 1;
                indices[1] = j + 1;
                break;
            }
        }
        return indices;
    }
}