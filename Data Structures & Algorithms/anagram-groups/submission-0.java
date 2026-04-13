class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
                Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] count = new int[26];

            // Build frequency array
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }

            // Convert frequency array to key
            String key = Arrays.toString(count);

            // Add to map
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
