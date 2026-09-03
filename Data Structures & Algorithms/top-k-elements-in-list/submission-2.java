class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> hmap = new HashMap<>();
        
        List<int[]> finalArr = new ArrayList<>();

        for(int num : nums){
            hmap.put(num,hmap.getOrDefault(num,0) + 1);
        }

       for(Map.Entry<Integer,Integer> entry : hmap.entrySet()){
        finalArr.add(new int[] {entry.getValue(),entry.getKey()});
       }
        finalArr.sort((a,b) -> b[0] - a[0]);

        int [] arr = new int[k];

        for(int i = 0; i < k; i++){
            arr[i] = finalArr.get(i)[1];
        }

        return arr;

    }
}
