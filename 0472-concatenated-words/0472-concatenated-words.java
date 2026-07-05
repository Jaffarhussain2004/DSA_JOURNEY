class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        HashMap<String, Boolean> hm = new HashMap<>();
        HashSet<String> hs = new HashSet<>();

        for (String word : words) {
            hs.add(word);
        }

        List<String> result = new ArrayList<>();

        for (String word : words) {
            hs.remove(word); 

            if (isConcatenated(word, hs, hm)) {
                result.add(word);
            }

            hs.add(word);
        }

        return result;
    }

    public static boolean isConcatenated(String word, Set<String> st, Map<String, Boolean >hm) {

        if (hm.containsKey(word)) {
            return hm.get(word);
        }

        for (int i = 0; i < word.length(); i++) {
            String prefix = word.substring(0, i + 1);
            String suffix = word.substring(i + 1);

            if (st.contains(prefix) &&
                (st.contains(suffix) || isConcatenated(suffix, st, hm))) {

                hm.put(word, true);
                return true;
            }
        }

        hm.put(word, false);
        return false;
    }
}