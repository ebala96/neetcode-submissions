class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,  List<String>> resultMap = new HashMap<>();
        for(String str : strs){
            int[] charCount = new int[26];
            for(char c : str.toCharArray()){
                charCount[c - 'a']++;
            }
            String key = Arrays.toString(charCount);
            resultMap.putIfAbsent(key, new ArrayList<>());
            resultMap.get(key).add(str);
        }

        return new ArrayList<>(resultMap.values());
    }
}
