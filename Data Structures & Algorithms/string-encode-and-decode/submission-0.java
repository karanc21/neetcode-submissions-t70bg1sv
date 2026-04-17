class Solution {

    public String encode(List<String> strs) {
    
        return strs.stream()
                .map(s -> s.length() + "#" + s)
                .collect(Collectors.joining());
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
