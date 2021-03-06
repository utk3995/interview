package com.interview.books.leetcodeoj;

/**
 * Created_By: stefanie
 * Date: 14-12-18
 * Time: 下午2:34
 */
public class LOJ12_IntegerToRome {
    static int[] weights = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    static String[] tokens = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    public static String intToRoman(int num) {
        StringBuilder builder = new StringBuilder();
        int start = 0;
        while (num > 0) {
            for (int i = start; i < 13; i++) {
                if (num >= weights[i]) {
                    num -= weights[i];
                    builder.append(tokens[i]);
                    break;
                }
                start = i + 1; // skip those impossible check, make it faster
            }
        }
        return builder.toString();
    }
}
