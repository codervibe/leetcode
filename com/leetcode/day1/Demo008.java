package com.leetcode.day1;

/**
 * Created by codervibe on 2024/9/9
 * DateTime:2024/09/09 下午5:30
 * Description:回文数
 * Others:给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * 回文数
 * 是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 例如，121 是回文，而 123 不是。
 */

public class Demo008 {
    public boolean isPalindrome(int num) {
        if (num < 0 || (num % 10 == 0 && num !=0)) {
            return false;
        }
        int revertedNumber =0;
        while (num > revertedNumber){
            revertedNumber = revertedNumber* 10 + num % 10;
            num /= 10;
        }
        return  num ==revertedNumber || num == revertedNumber/10;
    }

    public static void main(String[] args) {
        System.out.println(new Demo008().isPalindrome(-12));
    }
}
