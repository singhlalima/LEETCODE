class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {

//         HashMap<String, List<String>> map = new HashMap<>();

//         for (String s : strs) {

//             int[] freq = new int[26]; // for a to z

//             for (char c : s.toCharArray()) {
//                 freq[c - 'a']++;
//             }

//             // Create a unique key from frequency
//             StringBuilder keyBuilder = new StringBuilder();
//             for (int count : freq) {
//                 keyBuilder.append(count).append('#');
//             }
//             String key = keyBuilder.toString();

//             map.putIfAbsent(key, new ArrayList<>());
//             map.get(key).add(s);
//         }

//         return new ArrayList<>(map.values());
//     }
// }


