class Solution {

    public String encode(List<String> strs) {


        StringBuilder sb = new StringBuilder("");

        for(String s : strs){
            sb.append(String.valueOf(s.length())).append('#').append(s);
        }
        String encoded_string = String.join("",sb); 
        return encoded_string;
    }

    public List<String> decode(String str) {

        int i = 0;
        ArrayList<String> decoded_strs = new ArrayList<>();

        while(i < str.length()){
            int j = i;

            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));

            decoded_strs.add(str.substring(j+1, j +1 + length ));
            i = j + 1 + length;
        }

        return decoded_strs;
    }
}
