class Solution {
    public String mergeAlternately(String word1, String word2) {

        int  i = 0;
        int  j = 0;

        ArrayList<Character> arr = new ArrayList<>();

        while(i < word1.length() && j < word2.length()){
            arr.add(word1.charAt(i));
            arr.add(word2.charAt(j));
            i++;
            j++;
        }
        while(i < word1.length()){
            arr.add(word1.charAt(i));
            i++;
        }

        while(j < word2.length()){    
            arr.add(word2.charAt(j));
            j++;
        }
        StringBuilder sb = new StringBuilder();
        for(Character c : arr){
            sb.append(c);
        }
        return sb.toString();
    }
}