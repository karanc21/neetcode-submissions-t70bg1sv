class Solution {
    public int maxArea(int[] heights) {

        int n = heights.length ;
        int left = 0 , right = n - 1;
        int maxWaterStrored = 0 ;

        while(left < right){

            //calculate water stored
            int width = right - left ;
            int min = heights[left] < heights[right] ? heights[left++] : heights[right--] ;
            int waterStored = width * min ;
            maxWaterStrored = maxWaterStrored < waterStored ? waterStored : maxWaterStrored;
        }

        return maxWaterStrored ;
        
    }
}
