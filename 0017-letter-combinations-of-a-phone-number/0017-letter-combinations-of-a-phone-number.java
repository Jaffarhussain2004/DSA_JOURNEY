class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) return result;

        String[] digitLetters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        result.add("");
        for (char d : digits.toCharArray()) {
            String letters = digitLetters[d - '0'];
            List<String> next = new ArrayList<>();
            for (String prefix : result) {
                for (char c : letters.toCharArray()) {
                    next.add(prefix + c);
                }
            }
            result = next;
        }
        return result;
    }
}