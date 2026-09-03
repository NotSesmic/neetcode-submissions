class MyHashSet {

private: 
vector<int> set;

public:
    MyHashSet() {
        
    }
    
    void add(int key) {
        if (!contains(key)) {
            set.push_back(key);
        }        
    }
    
    void remove(int key) {
        auto iterator = find(set.begin(),set.end(),key);
        if(iterator != set.end()){
            set.erase(iterator);
        }
    }
    
    bool contains(int key) {
         
        if(find(set.begin(),set.end(),key) != set.end()) return true;
    
        else{
            return false;
        }       
    }
};
