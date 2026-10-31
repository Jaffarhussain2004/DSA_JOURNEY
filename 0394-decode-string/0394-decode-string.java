class Solution {
    public String decodeString(String s) {
        Stack<Integer> num = new Stack<>();
        Stack<String> str = new Stack<>();
        String curr = "";
        int n = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                n = n * 10 + (ch - '0');
            }
            else if (ch == '[') {
                num.push(n);
                str.push(curr);

                n = 0;
                curr = "";
            }
            else if (ch == ']') {
                int count = num.pop();
                String prev = str.pop();

                String temp = "";

                for (int j = 0; j < count; j++) {
                    temp += curr;
                }

                curr = prev + temp;
            }
            else {
                curr += ch;
            }
        }
        return curr;
    }
}