class Solution {
    public int[] getOrder(int[][] tasks) {

        int n = tasks.length;
        Integer [] indices = new Integer[n];

        for(int i = 0; i < n; i++){
            indices[i] = i;
        }
        Arrays.sort(indices,
            (a,b) -> tasks[a][0] != tasks[b][0] ? tasks[a][0] - tasks[b][0] : a - b
        );
        PriorityQueue<Integer> qp = new PriorityQueue<>(
            (a,b) -> tasks[a][1] != tasks[b][1] ? tasks[a][1] - tasks[b][1] : a - b
        );

        int [] result = new int[tasks.length];
        int time = 0;
        int i = 0, resIndex = 0;

        while(!qp.isEmpty() || i < n){

            while(i < n && tasks[indices[i]][0] <= time){
                qp.offer(indices[i]);
                i++;
            }
            if(qp.isEmpty()){
                time = tasks[indices[i]][0];
            }
            else{
                int nextIndex = qp.poll();
                time += tasks[nextIndex][1];
                result[resIndex++] = nextIndex;
            }
        }
        return result;
    }
}