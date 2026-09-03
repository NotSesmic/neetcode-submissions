class Solution {
    public String minWindow(String s, String t) {

        if(t.isEmpty()) return "";


            HashMap<Character,Integer> window = new HashMap<>();
            HashMap<Character,Integer> countT = new HashMap<>();

            for(char c : t.toCharArray()){
                countT.put(c,countT.getOrDefault(c,0) + 1);
            }

            int have = 0, need = countT.size();
            int minLen = Integer.MAX_VALUE;
            int [] resArr = {-1,-1};

            int left = 0;

            for(int right = 0; right < s.length(); right++){

                char c = s.charAt(right);

                window.put(c,window.getOrDefault(c,0) + 1);

                if(countT.containsKey(c) && window.get(c).equals(countT.get(c))){
                    have++;
                }

                while(have == need){
                    if((right - left + 1) < minLen){
                        minLen = right - left + 1;
                        resArr[0] = left;
                        resArr[1] = right;
                    }

                    window.put(s.charAt(left),window.get(s.charAt(left)) - 1);
                    if(countT.containsKey(s.charAt(left)) && window.get(s.charAt(left)) < countT.get(s.charAt(left))){
                        have--;
                    }
                    left++;
                }                
            }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(resArr[0],resArr[1] + 1);
    }
}
