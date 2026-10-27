class TrieNode{

    boolean isLeaf;
    TrieNode [] children;

    public TrieNode(){
        this.isLeaf = false;
        this.children = new TrieNode[26];
    }
}

class Solution {

    private int dfs(int i, String s, TrieNode root, int[] dp) {
        if (i == s.length()) return 0;
        if (dp[i] != -1) return dp[i];

        int res = 1 + dfs(i + 1, s, root, dp);
        TrieNode curr = root;

        for (int j = i; j < s.length(); j++) {
            if (curr.children[s.charAt(j) - 'a'] == null) break;
            curr = curr.children[s.charAt(j) - 'a'];
            if (curr.isLeaf) {
                res = Math.min(res, dfs(j + 1, s, root, dp));
            }
        }

        dp[i] = res;
        return res;
    }

    public int minExtraChar(String s, String[] dictionary) {

        TrieNode root = new TrieNode();

        int [] dp = new int[s.length() + 1];
        Arrays.fill(dp,-1);

        for(String str : dictionary){
            TrieNode curr = root;
            for(char c : str.toCharArray()){
                if(curr.children[c - 'a'] == null){
                    curr.children[c - 'a'] = new TrieNode();
                }
                curr = curr.children[c - 'a'];
            }
            curr.isLeaf = true;
        } 

        return dfs(0,s,root,dp);   
        
    }
}