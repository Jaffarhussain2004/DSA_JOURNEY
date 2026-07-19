class Solution {
    public int compress(char[] chars) {

        int write = 0;
        int read = 0;

        while (read < chars.length) {

            char ch = chars[read];
            int start = read;
            while (read < chars.length && chars[read] == ch) {
                read++;
            }

            int count = read - start;

            chars[write++] = ch;
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}