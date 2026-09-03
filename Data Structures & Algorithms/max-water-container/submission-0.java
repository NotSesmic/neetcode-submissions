class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int area = 0;
        while(i < j){
            int temp = Math.abs(j - i)*Math.min(height[j],height[i]);
            if(temp > area){
                area = temp;
            }
            else{
                if(height[i] > height[j]){
                    j--;
                }
                else{
                    i++;
                }
            }
        }
        return area;
    }
}