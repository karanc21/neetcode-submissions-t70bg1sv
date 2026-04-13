class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false ;
        int[] s1 = new int[256];

        for(char c : s.toCharArray()){
            s1[c]++;
        }

        for(char c : t.toCharArray()){
            s1[c]--;
        }

        for(int i = 0 ; i < 256 ; i++){
            if(s1[i] > 0) return false;
        }

        return true;
    }
}
