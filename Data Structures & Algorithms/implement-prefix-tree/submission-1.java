class TrieNode{

    TrieNode [] children;
    boolean isLeaf;

    public TrieNode(){
        this.isLeaf = false;
        this.children = new TrieNode[26];
    }
}

class PrefixTree {

    TrieNode root;

    public PrefixTree() {
         this.root = new TrieNode();
    }

    public void insert(String word) {

        TrieNode curr = root;

        for(char c : word.toCharArray()){
            if(curr.children[c - 'a'] == null){
                curr.children[c - 'a'] = new TrieNode();
            }
            curr = curr.children[c - 'a'];
        }
        curr.isLeaf = true;
    }

    public boolean search(String word) {

        TrieNode curr = root;

        for(char c : word.toCharArray()){
            if(curr.children[c - 'a'] == null) return false;
            curr = curr.children[c - 'a'];
        }
        if(!curr.isLeaf) return false;
        return true;
    }

    public boolean startsWith(String prefix) {

        TrieNode curr = root;
        for(char c : prefix.toCharArray()){
            if(curr.children[c - 'a'] == null) return false;
            curr = curr.children[c - 'a'];
        }
        return true;
    }
}