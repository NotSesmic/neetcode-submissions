class LinkedNode {

     int key, value;
     LinkedNode next;

    public LinkedNode(int k, int v, LinkedNode next) {
        this.key = k;
        this.value = v;
        this.next = next;
    }

    public LinkedNode() {
        this(-1,-1,null);
    }
}

class MyHashMap {

    private LinkedNode [] mp = new LinkedNode[1000];
    int numOfEle = mp.length;

    public MyHashMap() {

        for(int i = 0; i < numOfEle;i++){
            mp[i] = new LinkedNode();
        }
    }

    private int hash(int num){
        return ( num % numOfEle);
    }

    public void put(int key, int value) {

        LinkedNode curr = mp[hash(key)];

        while(curr.next != null){
            if(curr.next.key == key){
                curr.next.value = value;
                return; //one mistake here, forgot to return when you got the solution
            }
            curr = curr.next;
        }
        curr.next = new LinkedNode(key,value,null);
    }

     public int get(int key) {

        LinkedNode curr = mp[hash(key)];

        while(curr != null){
            if(curr.key == key){
                return curr.value;
            }
            curr  = curr.next;
        }
        return -1;
     }

    public void remove(int key) {
        LinkedNode curr = mp[hash(key)];

        while(curr.next != null){
            if(curr.next.key == key){
                curr.next = curr.next.next;
                return; //once again forgot to terminate
            }
            curr = curr.next; //forgot this, need to traverse if key doesn't match
        }
    }
}