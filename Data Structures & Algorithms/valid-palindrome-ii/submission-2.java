class Solution {
    public boolean validPalindrome(String s) {

        int strLen = s.length();
        int left = 0;
        int right = strLen - 1;
        int count = 0;

        while(left < right){
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return isPalindrome(s,left + 1,right) || isPalindrome(s,left,right - 1);
            }
            left++;
            right--;
        }
        return true;
        
    }
}

private boolean isPalindrome(String s,int l, int r){
    while(l < r){
        if(s.charAt(l) != s.charAt(r)){
            return false;
        }
        l++;
        r--;
    }
    return true;
}