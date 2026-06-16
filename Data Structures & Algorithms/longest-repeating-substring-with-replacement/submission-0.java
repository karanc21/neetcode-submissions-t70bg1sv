class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];
        int maxFreq = 0 ;
        int ans = 0;
        int i = 0 ;

        for(int j = 0 ; j < s.length() ; j++){

            char ch = s.charAt(j);
            //increment the freq of char
            freq[ch - 'A']++;
            //update max
            maxFreq = Math.max(maxFreq , freq[ch - 'A']);

            //check if window valid
            while((j - i + 1) - maxFreq > k){
                freq[s.charAt(i) - 'A']--;
                i++;
            }

            ans = Math.max(ans , j - i + 1);

        }

        return ans ;
        
    }
}
