package com.leetcode.day3;

/**
 * Created by codervibe on 2024/9/11
 * DateTime:2024/09/11 下午1:05
 * Description: 合并两个有序数组
 * Others:给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，
 * nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 */

public class Demo001 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 使用两个指针
        int pointer1 =0,pointer2 = 0;
        int [] sorted = new int[m + n];
        int cur;
        while (pointer1 < m || pointer2 < n) {
            if (pointer1 == m) {
                cur =nums2[pointer2++];
            } else if (pointer2 == n) {
                cur = nums1[pointer1 ++];
            } else if (nums1[pointer1] < nums2[pointer2]) {
                cur = nums1[pointer1 ++ ];

            }else{
                cur = nums2[pointer2];
            }
            sorted[pointer1 + pointer2 - 1] = cur;
        }
        for (int i = 0; i != m + n; ++i) {
            nums1[i] = sorted[i];
        }
    }
}
