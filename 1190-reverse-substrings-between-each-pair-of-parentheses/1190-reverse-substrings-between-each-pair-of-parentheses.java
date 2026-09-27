class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == ')') {
                String temp = "";
                while (st.peek() != '(') {
                    temp += st.pop();
                }
                st.pop(); 
                for (char ch : temp.toCharArray()) {
                    st.push(ch);
                }
            } 
            else {
                st.push(c);
            }
        }
        String ans = "";
        while (!st.isEmpty()) {
            ans = st.pop() + ans;
        }
        return ans;
    }
}