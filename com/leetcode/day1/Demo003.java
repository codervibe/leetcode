package com.leetcode.day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by codervibe on 2024/9/9
 * DateTime:2024/09/09 上午11:06
 * Description:128. 最长连续序列 中等
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
 * Others:
 */

public class Demo003 {
    // 29ms
//    public int longestConsecutive(int[] nums) {
//
//        Set<Integer> numSet = new HashSet<>();
//        for (int num : nums) {
//            numSet.add(num);
//        }
//        int longestStreak = 0;
//        for (int num : numSet) {
//            if (!numSet.contains(num - 1)) {
//                int currentNum = num;
//                int currentStreak = 1;
//                while (numSet.contains(currentNum + 1)) {
//                    currentNum += 1;
//                     currentStreak +=1;
//
//                }
//                longestStreak = Math.max(longestStreak,currentStreak);
//            }
//        }
//        return longestStreak;
//    }
    // 11ms
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        Arrays.sort(nums);
//        System.out.println("排序之后 nums = " + nums);
        int preNum = nums[0];
        int max = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - 1 == preNum) {
                count++;
            } else if ((nums[i] == preNum)) {

            } else {
                max = Math.max(max, count);
                count = 1;
            }
            preNum = nums[i];
        }
        max = Math.max(max, count);
        return max;

    }

    public static void main(String[] args) {
        int nums[] = {1, 5, 10, 7, 3, 9, 4, 2, 12, 100, 24, 25, 23, 8, 6};
        int i = new Demo003().longestConsecutive(nums);
        System.out.println("i = " + i);


    }
}
