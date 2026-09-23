class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        for (char c : s.toCharArray()) {
            h.put(c, h.getOrDefault(c, 0) + 1);
        }
        List<Character> list = new ArrayList<>(h.keySet());
        Collections.sort(list, (a, b) -> h.get(b) - h.get(a));
        
        StringBuilder ans = new StringBuilder();
        for (char c : list) {
            for (int i = 0; i < h.get(c); i++) {
                ans.append(c);
            }
        }
        return ans.toString();
    }
}