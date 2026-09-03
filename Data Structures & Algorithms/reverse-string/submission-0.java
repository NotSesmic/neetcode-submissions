class Solution {
    public void reverseString(char[] s) {
        
        int left = 0;
        int right = s.length - 1;

        while(left < right){
            char temp1 = s[left];
            char temp2 = s[right];
            s[left] = temp2;
            s[right] = temp1;

            left++;
            right--;
        }

    }
}