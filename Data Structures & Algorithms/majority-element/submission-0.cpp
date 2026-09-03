class Solution {
public:
    int majorityElement(vector<int>& nums) {

        int numOfEle = nums.size();
        unordered_map<int,int> freq;

        for(auto ele : nums){
            freq[ele]++;
        }

        for(auto pair : freq){
            if(pair.second > floor(numOfEle/2)) return pair.first;
        }

        
    }
};