class Solution {
    public String reorganizeString(String s) {

        int len = s.length();
        int [] charFreq = new int[26];

        for(char c : s.toCharArray()){
            charFreq[c - 'a']++;
        }

        PriorityQueue<int []> freq = new PriorityQueue<>((a,b) -> b[0] - a[0]);

        for(int i = 0; i < 26;i++){
            if(charFreq[i] > 0){
                freq.add(new int [] {charFreq[i],i});
            }
        }

        if(freq.peek()[0] > (len + 1)/2) return "";
        StringBuilder res = new StringBuilder();

        int [] prev = null;
        int time = 0;
        while(!freq.isEmpty() || prev != null){
            if(prev != null && freq.isEmpty()){
                return "";
            }

            int [] curr = freq.poll();

            res.append((char)(curr[1] + 'a'));
            curr[0]--;

            if(prev != null){
                freq.add(prev);
                prev = null;
            }
            if(curr[0] > 0){
                prev = curr;
            }
        } 
        return res.toString();
    }
}