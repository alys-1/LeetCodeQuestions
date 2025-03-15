class Solution {
    public int myAtoi(String s) {
        int i = 0, sign = 1, res = 0;
        int n = s.length();

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i < n && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < n && s.charAt(i) == '+') {
            i++;
        }

        while (i < n && Character.isDigit(s.charAt(i))) {
            int num = s.charAt(i) - '0';

            if (res > (Integer.MAX_VALUE - num) / 10) {
                if (sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }

            res = res * 10 + num;
            i++;
        }

        return res * sign;
    }
}
