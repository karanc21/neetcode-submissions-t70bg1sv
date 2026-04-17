class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) return 0;

        HashSet<Integer> hs = new HashSet<>();
        int max = 0;

        for (int n : nums) hs.add(n);

        for (int n : nums) {

            // Only start if it's the beginning of a sequence
            if (!hs.contains(n - 1)) {
                int current = n;
                int count = 1;

                while (hs.contains(current + 1)) {
                    current++;
                    count++;
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }
}
