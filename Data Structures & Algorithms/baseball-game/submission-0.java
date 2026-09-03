class Solution {
    public int calPoints(String[] operations) {
    
        int numOfOperations = operations.length;
        List<Integer> record = new ArrayList<Integer>();
        int pointer = 0;

        for(int i = 0; i < numOfOperations; i++){
            if(operations[i].equals("C")){
                pointer--;
                record.remove(pointer);
            }
            else if(operations[i].equals("D")){
                int temp = record.get(pointer - 1);
                record.add(pointer++,temp * 2);


            }
            else if(operations[i].equals("+")){
                int temp1 = record.get(pointer - 1);
                int temp2 =record.get(pointer - 2);
                record.add(pointer++,temp1+temp2);
            }
            else{
                record.add(pointer++,Integer.parseInt(operations[i]));
            }
        }

        int sum = 0;
        for(Integer ele: record){
            sum += ele;
        }

        return sum;
    }
}