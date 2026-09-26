class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        HashMap<String, String> h = new HashMap<>();
        for (List<String> x : knowledge) {
            h.put(x.get(0), x.get(1));
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                StringBuilder key = new StringBuilder();
                i++;
                while (s.charAt(i) != ')') {
                    key.append(s.charAt(i));
                    i++;
                }
                if (h.containsKey(key.toString())) {
                    ans.append(h.get(key.toString()));
                } else {
                    ans.append("?");
                }
            } else {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}