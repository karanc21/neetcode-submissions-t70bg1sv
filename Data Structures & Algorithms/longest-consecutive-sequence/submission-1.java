class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) return 0 ;

        HashSet<Integer> hs = new HashSet<>();
        int max = 1 ;

        for(int n : nums) hs.add(n);

        for(int n : nums){

            if(hs.contains(n - 1)){
                int i = n + 1;
                int count = 2 ;
                while(hs.contains(i)){
                    i++;
                    count++;
                }
                max = Math.max(max , count) ;
            }
        } 
        return max ;
    }
}
