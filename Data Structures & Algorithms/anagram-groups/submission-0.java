class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int size = strs.length;
        List<List<String>> summary = new ArrayList<>();
        if (size == 1) {
            List<String> ele = new ArrayList<>();
            ele.add(strs[0]);
            summary.add(ele);
            return summary;
        }
        
        Map<String, List<String>> map = new HashMap<>();

        for (String str: strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        
        for(Map.Entry<String, List<String>> entry: map.entrySet()) {
            summary.add(entry.getValue());
        }

        return summary;
    }
}
