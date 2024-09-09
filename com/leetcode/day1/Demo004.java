package com.leetcode.day1;

import java.util.Arrays;

/**
 * Created by codervibe on 2024/9/9
 * DateTime:2024/09/09 下午3:08
 * Description: 移动零 简单
 * 提示
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * Others:
 */

public class Demo004 {
//    public void moveZeroes(int[] nums) {
//        if (nums ==null) {
//            return;
//        }
//        int j = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                nums[j++] =nums[i];
//            }
//        }
//        for (int i = j; i < j ; i++) {
//            nums[j]  = 0;
//        }
//
//    }
    public void moveZeroes(int[] nums) {
        if (nums ==null) {
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
               int temp =nums[i];
               nums[i] = nums[j];
               nums[j++] = temp;
            }
        }


    }

    public static void main(String[] args) {
        int nums[] = {0, 0, 1, 5, 10, 7, 3, 9, 0, 0, 4, 2, 12, 100, 24, 25, 23, 8, 6};
        new Demo004().moveZeroes(nums);
    }
}
