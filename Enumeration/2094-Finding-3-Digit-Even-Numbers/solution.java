class Solution {
    public int[] findEvenNumbers(int[] digits) {

        TreeSet<Integer> set = new TreeSet<>();

        int n = digits.length;

        for (int i = 0; i < n; i++) {

            if (digits[i] == 0)
                continue; // leading zero not allowed

            for (int j = 0; j < n; j++) {

                if (i == j)
                    continue;

                for (int k = 0; k < n; k++) {

                    if (i == k || j == k)
                        continue;

                    if (digits[k] % 2 != 0)
                        continue; // must be even

                    int num = digits[i] * 100
                            + digits[j] * 10
                            + digits[k];

                    set.add(num);
                }
            }
        }

        int[] ans = new int[set.size()];
        int idx = 0;

        for (int num : set) {
            ans[idx++] = num;
        }

        return ans;
    }
}