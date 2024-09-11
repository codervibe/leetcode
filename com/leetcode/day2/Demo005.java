package com.leetcode.day2;

/**
 * Created by codervibe on 2024/9/10
 * DateTime:2024/09/10 下午9:44
 * Description: 加一
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * Others:
 */

public class Demo005 {
    public int[] plusOne(int[] digits) {

        int n = digits.length;
        for (int i = n - 1; i >= 0; --i) {
            if (digits[i] != 9) {
                ++digits[i];
                for (int j = i + 1; j < n; ++j) {
                    digits[j] = 0;

                }
                return digits;
            }



        }
        digits= new int[n + 1];
        digits[0] = 1;
        return digits;
    }
//    public int[] plusOne(int[] digits) {
//        int numLen = digits.length;
//        for (int i = numLen - 1; i >= 0; i--) {
//            digits[i] = (digits[i] + 1) % 10;
//            if (digits[i] !=0) {
//                return  digits;
//            }
//        }
//        digits =new  int[numLen + 1];
//        digits[0] = 1;
//        return digits;
//    }

    public static void main(String[] args) {
        int digits[] = {10};
        int[] ints = new Demo005().plusOne(digits);
        for (int anInt : ints) {
            System.out.println("anInt = " + anInt);

        }
    }
}
