class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        int [] alpha = new int[26];

        for(char task : tasks){
            alpha[task - 'A']++;
        }

        PriorityQueue<Integer> freq = new PriorityQueue<>(Collections.reverseOrder());

        for(int ele : alpha){
            if(ele > 0) freq.offer(ele);
        }

        int time = 0;
        Queue<int[]> buffer = new LinkedList<>();

        while(!freq.isEmpty() || !buffer.isEmpty()){
            time++;

            if(freq.isEmpty()){
                time = buffer.peek()[1];
            }else{
                int temp = freq.poll() - 1;
                if(temp > 0){
                    buffer.offer(new int[]{temp,time + n});
                }
            }
            if(!buffer.isEmpty() && buffer.peek()[1] == time){
                freq.offer(buffer.poll()[0]);
            }

        }
        return time;
    }
}
