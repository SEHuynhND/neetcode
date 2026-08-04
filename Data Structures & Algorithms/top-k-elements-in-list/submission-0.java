class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int length = nums.length;

        for (int i = 0; i < length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        return map.entrySet().stream()
            .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
            .limit(k)
            .mapToInt(Map.Entry::getKey)
            .toArray();
    }
}
