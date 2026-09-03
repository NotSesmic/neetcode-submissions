class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        System.out.print(Arrays.toString(people));

        int numOfBoats = 0;
        int i = 0;
        int j = people.length - 1;

        while(i <= j){
            int remain = limit - people[j--];
            numOfBoats++;

            if(i <= j && remain >= people[i]){
                i++;
            }
        }
        return numOfBoats;
        
    }
}