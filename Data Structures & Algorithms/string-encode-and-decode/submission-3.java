class Solution {

    public String encode(List<String> strs) {
    
        if(strs == null || strs.size() == 0)return "";
        StringBuilder result = new StringBuilder();
        for(String s: strs){
            result.append(s.length()).append("#").append(s);
        }
        return result.toString();
    }

    public List<String> decode(String str) {

        List<String> res = new ArrayList<>();
        int n = str.length() ;
        int i = 0 ;
        while (i < n){

            int j = i ;

            while (str.charAt(j) != '#'){
                j++;
            }

            int len = Integer.parseInt(str.substring(i , j));

            String word = str.substring(j + 1 , j + 1 + len);
            res.add(word);

            i = j + len + 1 ;

        }
       return res;
    }
}
