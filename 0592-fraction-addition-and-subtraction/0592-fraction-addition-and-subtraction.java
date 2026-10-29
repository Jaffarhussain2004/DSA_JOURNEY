class Solution {
    public String fractionAddition(String expression) {
        int num = 0;
        int den = 1;

        int i = 0;

        while (i < expression.length()) {
            int sign = 1;

            if (expression.charAt(i) == '-') {
                sign = -1;
                i++;
            } else if (expression.charAt(i) == '+') {
                i++;
            }

            int n = 0;

            while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                n = n * 10 + (expression.charAt(i) - '0');
                i++;
            }

            n *= sign;
            i++; // skip '/'

            int d = 0;

            while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                d = d * 10 + (expression.charAt(i) - '0');
                i++;
            }

            num = num * d + n * den;
            den = den * d;

            int gcd = gcd(Math.abs(num), den);

            num /= gcd;
            den /= gcd;
        }

        return num + "/" + den;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}